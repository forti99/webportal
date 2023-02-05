const showAllMitglieder = (event) => {
    event.preventDefault();
    $.get("http://localhost:8080/mitgliedsdaten/alleAbrufen", null, function (data) {
        const mainContainer = document.getElementById("mitglieder");
        const saveTr = mainContainer.firstElementChild;
        mainContainer.innerHTML = "";
        mainContainer.appendChild(saveTr);
        for (let i = 0; i < data.length; i++) {
            const tr = document.createElement("tr");
            const td1 = document.createElement("td");
            const td2 = document.createElement("td");
            const td3 = document.createElement("td");
            const td4 = document.createElement("td");
            const td5 = document.createElement("td");
            td1.innerHTML = data[i].mitgliedId;
            td2.innerHTML = data[i].vorname;
            td3.innerHTML = data[i].name;
            td4.innerHTML = data[i].alter;
            td5.innerHTML = data[i].adresse;
            mainContainer.appendChild(tr);
            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);
            tr.appendChild(td4);
            tr.appendChild(td5);
        }
        console.log(data)
    })
}

const showOneMitglieder = (event) => {
    event.preventDefault();
    let mitgliedId = parseFloat(document.getElementById("idMitglied").value);
    $.get(`http://localhost:8080/mitgliedsdaten/abrufenNachId/${mitgliedId}`, null, function (data) {
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

document.getElementById('getAllMitglieder').addEventListener('click', showAllMitglieder);
document.getElementById('getMitgliedById').addEventListener('click', showOneMitglieder);