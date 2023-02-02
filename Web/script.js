const loadDataButton = document.querySelector('#loadDataButton');
const list = document.querySelector('#list');

const fetchData = () =>
{
       // fetch('https://webapi.developers.erstegroup.com/api/csas/public/sandbox/v2/rates/exchangerates?web-api-key=c52a0682-4806-4903-828f-6cc66508329e')
         fetch('http://localhost:8080/currencies?usedb=true')
        .then(response => response.json())
        .then(createList)
        .catch(error => console.error(error));
};

const createList = data =>
{
    list.innerHTML = ""
    data.forEach(item =>
    {
        const newListElement = document.createElement("li");
        newListElement.textContent = item.country
            list.appendChild(newListElement);

        // Add event for each country
        newListElement.addEventListener("click", function ()
        {
            window.location.href = `details.html?data=${JSON.stringify(item)}`;
        }
        );
    }
    );
};

loadDataButton.addEventListener('click', fetchData);
