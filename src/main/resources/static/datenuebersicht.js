const showAllMitglieder = (event) => {
    event.preventDefault();
    $.get("http://localhost:8080/datenuebersicht/alleAbrufen", null, function (data) {
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
            const td6 = document.createElement("td");
            const td7 = document.createElement("td");
            td1.innerHTML = data[i].mitgliedId;
            td2.innerHTML = data[i].vorname;
            td3.innerHTML = data[i].name;
            td4.innerHTML = data[i].adresse;
            td5.innerHTML = data[i].alter;
            td6.innerHTML = data[i].beitrag;
            td7.innerHTML = data[i].eintrittsalter;

            mainContainer.appendChild(tr);
            tr.appendChild(td1);
            tr.appendChild(td2);
            tr.appendChild(td3);
            tr.appendChild(td4);
            tr.appendChild(td5);
            tr.appendChild(td6);
            tr.appendChild(td7);
        }
        console.log(data)
    })
}

document.getElementById('getAllMitglieder').addEventListener('click', showAllMitglieder);
