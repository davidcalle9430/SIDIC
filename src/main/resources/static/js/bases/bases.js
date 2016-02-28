/**
 * 
 */
var pagina = 0;
var alFinal = false;
function ajaxCall() {
	$.ajax({
		url : '/api/tipoOperacionBases?projection=tipo&page=' + pagina,
		success : function(data) {
			crearFila(data);
			alFinal = false;
			pagina++;
		},
		error : function(data) {
			console.log("Error al recuperar los datos");
		}
	})
}

function crearFila(bases) {
	bases = bases._embedded.tipoOperacionBases;
	for (var i = 0; i < bases.length; i++) {
		var tr = $("<tr>");
		var columnaOperacion = $('<td>', {
			text : bases[i].tipooperacion1.codigo
		});
		var columnaNombre = $('<td>', {
			text : bases[i].tipooperacion1.nombre
		});
		var columnaImpuesto = $('<td>', {
			text : bases[i].tipooperacionbasesPK.impuesto
		});
		var columnaBase = $('<td>', {
			text : bases[i].base
		});
		var columnaPorcentaje = $('<td>', {
			text : bases[i].porcentaje
		});
		var columnaTipo = $('<td>', {
			text : bases[i].tipo ==	"1" ? "por cien" : "por mil"
		});
		tr.append(columnaOperacion);
		tr.append(columnaNombre);
		tr.append(columnaImpuesto);
		tr.append(columnaBase);
		tr.append(columnaPorcentaje);
		tr.append(columnaTipo);
		$('tbody').append(tr);
	}
}
function clicFila(){
	var hijos = $(this).children();
	window.location = "editar/?zona="+hijos[0].innerHTML;
}

var head = $("thead"); // busca los headers de la tabla
var columnas = 6; // numero de columnas de la tabla
$(document).ready(function() {
			ajaxCall();
			$(window).scroll(function() {
				if ($(window).scrollTop() + $(window).height() > $(document).height() - 50) {
					if (!alFinal) {
						alFinal = true;
						ajaxCall();
					}
				}
				if(head.position().top -$(this).scrollTop() < 0 ){
					head.css("position", "fixed");
					head.css("top", "0px");
					head.css("width", "90vw");
					head.find("th").each(function(el){
						$(this).css("width", 90 / columnas + "vw")
					});
					$('table').find("th").each(function(el){
						$(this).css("width", 90 / columnas + "vw")
					});
				}else{
					head.css("position", "");
					head.css("top", "");
				}
			});
			$("table").on("click","tr", clicFila);
});