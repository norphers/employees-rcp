function addEmployee()
{
  var name = document.getElementById('name').value;
  var role = document.getElementById('role').value.toUpperCase();

  var myHeaders = new Headers();
  myHeaders.append("Content-Type", "application/json");
  
  var raw = JSON.stringify({"name":name,"role":role});
  
  var requestOptions = 
  {
    method: 'POST',
    headers: myHeaders,
    body: raw,
    redirect: 'follow'
  };
  
  fetch("http://localhost:8080/employees", requestOptions)
    .then(response => response.text())
    .then(result => console.log(result))
    .catch(error => console.log('error', error));
}

function getEmployee()
{
  $.ajax(
  {
    type:'GET',
    url: "http://localhost:8080/employees",
    success: function(data)
    {
      console.log(data)
      var myEmployees = data
      var col = [];
        for (var i = 0; i < myEmployees.length; i++) 
        {
          for (var key in myEmployees[i]) 
          {
            if (col.indexOf(key) === -1) 
            {
              col.push(key);
            }
          }
        }

      var table = document.createElement("table");  
      var tr = table.insertRow(-1);
        for (var i = 0; i < col.length; i++) 
        {
          var th = document.createElement("th");      // TABLE HEADER.
          th.innerHTML = col[i];
          tr.appendChild(th);
        }
          
        for (var i = 0; i < myEmployees.length; i++) 
        {
          tr = table.insertRow(-1);
          for (var j = 0; j < col.length; j++) 
          {
            var tabCell = tr.insertCell(-1);
            tabCell.innerHTML = myEmployees[i][col[j]];
          }
        }
          
        var divContainer = document.getElementById("showData");
        divContainer.innerHTML = "";
        divContainer.appendChild(table);
    },
    error: function(error)
    {
      alert(error);
    }
  });
  console.log("getEmployee() process done")
}