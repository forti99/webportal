const formElement = document.querySelector('form#forms')
const getFormJSON = (form) => {
    const data = new FormData(form);
    return Array.from(data.keys()).reduce((result, key) => {
        result[key] = data.get(key);
        return result;
    }, {});
};

const saveDataHandler = (event) => {
    event.preventDefault();
    const valid = formElement.reportValidity();
    if (valid) {
        const result = getFormJSON(formElement);
        $.ajax({
            url: 'http://localhost:8080/mitglied/registrieren',
            type: 'POST',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(result)
        });
        console.log(result)
    }
}

formElement.addEventListener("submit", saveDataHandler)