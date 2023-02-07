const renteBerechnen = (event) => {
    event.preventDefault();
    let alter = parseInt(document.getElementById("alter").value);
    let beitrag = parseFloat(document.getElementById("beitrag").value);
    let eintrittsalter = parseInt(document.getElementById("eintrittsalter").value);

    $.get(`http://localhost:8080/rechner/${alter}/${beitrag}/${eintrittsalter}`, null, function (data) {
        document.getElementById("ergebnisRente").value = data;
        console.log(data);
    })
}

const showOneMitglied = (event) => {
    event.preventDefault();
    let id = parseFloat(document.getElementById("idMitglied").value);
    $.get(`http://localhost:8080/mitgliederverwaltung/abrufenNachId/${id}`, null, function (data) {
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
        const td6 = document.createElement("td");
        const td7 = document.createElement("td");
        td1.innerHTML = data.mitgliedId;
        td2.innerHTML = data.vorname;
        td3.innerHTML = data.name;
        td4.innerHTML = data.adresse;
        td5.innerHTML = data.alter;
        td6.innerHTML = data.beitrag;
        td7.innerHTML = data.eintrittsalter;

        mainContainer.appendChild(tr);
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tr.appendChild(td5);
        tr.appendChild(td6);
        tr.appendChild(td7);
        console.log(data);

        let alter = data.alter;
        let beitrag = data.beitrag;
        let eintrittsalter = data.eintrittsalter;

        $.get(`http://localhost:8080/rechner/${alter}/${beitrag}/${eintrittsalter}`, null, function (data) {
            document.getElementById("ergebnisMitgliedRente").value = data;
            console.log(data);
        })
    })
}

document.getElementById("beitragBerechnen").addEventListener('click', renteBerechnen);
document.getElementById("getMitgliedById").addEventListener('click', showOneMitglied);