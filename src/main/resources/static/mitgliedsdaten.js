const showAllMitglieder = (event) => {
    event.preventDefault();
    $.get("http://localhost:8080/mitglied/alleAbrufen", null, function (data) {
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
            td1.innerHTML = data[i].vorname;
            td2.innerHTML = data[i].name;
            td3.innerHTML = data[i].alter;
            td4.innerHTML = data[i].adresse;
            mainContainer.appendChild(tr);
            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);
            tr.appendChild(td4);
        }
        console.log(data)
    })
}

const showOneMitglieder = (event) => {
    event.preventDefault();
    let mitgliedId = parseFloat(document.getElementById("idMitglied").value);
    $.get(`http://localhost:8080/mitglied/abrufenNachId/${mitgliedId}`, null, function (data) {
        const mainContainer = document.getElementById("mitglied");
        const saveTr = mainContainer.firstElementChild;
        mainContainer.innerHTML = "";
        mainContainer.appendChild(saveTr);

        const atr = document.createElement("tr");
        const atd1 = document.createElement("td");
        const atd2 = document.createElement("td");
        const atd3 = document.createElement("td");
        const atd4 = document.createElement("td");
        atd1.innerHTML = data.vorname;
        atd2.innerHTML = data.name;
        atd3.innerHTML = data.alter;
        atd4.innerHTML = data.adresse;
        mainContainer.appendChild(atr);
        atr.appendChild(atd1);
        atr.appendChild(atd2);
        atr.appendChild(atd3);
        atr.appendChild(atd4);

        console.log(data);
    })
}

function hideAllMitglieder() {
    document.getElementById("mitglieder").innerHTML = "";
}

document.getElementById('getAllMitglieder').addEventListener('click', showAllMitglieder);
document.getElementById('hideAllMitglieder').addEventListener('click', hideAllMitglieder);
document.getElementById('getMitgliedById').addEventListener('click', showOneMitglieder);