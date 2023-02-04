const getFormJSON = (form) => {
    const data = new FormData(form);
    return Array.from(data.keys()).reduce((result, key) => {
        result[key] = data.get(key);
        return result;
    }, {});
};

const saveMitgliedDaten = (event) => {
    event.preventDefault();
    const result = getFormJSON(document.getElementById('eingabeMitgliedsdaten'));
    $.ajax({
        url: 'http://localhost:8080/mitglied/registrieren',
        type: 'POST',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(result)
    });
    console.log(result);
}

document.getElementById('saveMember').addEventListener('click', saveMitgliedDaten);