const backButton = document.getElementById("backButton");
const definition = document.getElementById("definition");
const params = new URLSearchParams(window.location.search);
const item = JSON.parse(params.get('data'));

definition.innerHTML = `<div><h2>${item.country}</h2></div>`;

//create table
const table = document.createElement('table');
definition.appendChild(table);

// Create a table header row
const headerRow = document.createElement('tr');
table.appendChild(headerRow);
//Header row
const headers = Object.keys(item);
headers.forEach(header =>
{
    const th = document.createElement('th');
    th.textContent = header;
    headerRow.appendChild(th);
}
);
//Content of table
const row = document.createElement('tr');
table.appendChild(row);
headers.forEach(header =>
{
    const td = document.createElement('td');
    td.textContent = item[header];
    row.appendChild(td);
}
);

//button event
backButton.addEventListener('click', function ()
{
    window.location.href = "index.html";
}
);
