const getFormJSON = (form) => {
    const data = new FormData(form);
    return Array.from(data.keys()).reduce((result, key) => {
        result[key] = data.get(key);
        return result;
    }, {});
};

const saveMitgliedDaten = (event) => {
    event.preventDefault();
    let mitgliedsdaten = document.getElementById('eingabeMitgliedsdaten');
    const result = getFormJSON(mitgliedsdaten);
    $.ajax({
        url: 'http://localhost:8080/mitgliederverwaltung/registrieren',
        type: 'POST',
        contentType: 'application/json; charset=utf-8',
        data: JSON.stringify(getFormJSON(mitgliedsdaten))
    });
    console.log(result);
}

const showOneMitglieder = (event) => {
    event.preventDefault();
    let mitgliedId = parseFloat(document.getElementById("idMitglied").value);
    $.get(`http://localhost:8080/mitgliederverwaltung/abrufenNachId/${mitgliedId}`, null, function (data) {
        const mainContainer = document.getElementById("mitglied");
        const saveTr = mainContainer.firstElementChild;
        mainContainer.innerHTML = "";
        mainContainer.appendChild(saveTr);

        const tr = document.createElement("tr");
        const td1 = document.createElement("td");
        const td2 = document.createElement("td");
        const td3 = document.createElement("td");
        const td4 = document.createElement("td");
        const td5 = document.createElement("td");
        td1.innerHTML = data.mitgliedId;
        td2.innerHTML = data.vorname;
        td3.innerHTML = data.name;
        td4.innerHTML = data.alter;
        td5.innerHTML = data.adresse;
        mainContainer.appendChild(tr);
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tr.appendChild(td5);
        console.log(data);
    })
}

document.getElementById('saveMember').addEventListener('click', saveMitgliedDaten);
document.getElementById('getMitgliedById').addEventListener('click', showOneMitglieder);