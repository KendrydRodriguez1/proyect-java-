// Call the dataTables jQuery plugin
$(document).ready(function () {
  CargarUsuarios()
  $('#usuarios').DataTable();
});



async function CargarUsuarios() {
  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'accept': 'application/json',
      'Content-Type': 'application/json'
    },

  });
  const user = await request.json()
  let usuariosHtml;
  for(let users of user){
    usuariosHtml += '<tr><th>'+ users.id  +'</th><th>'+ users.nombre  +'</th><th>'+ users.email  +'</th><th>'+ users.apellido  +'</th><th><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></th></tr>'
  }

  document.querySelector('#usuarios tbody').outerHTML = usuariosHtml
}