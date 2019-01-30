"use strict";
$(function(){
    $("#loader").hide();
	$(document).ajaxStart(function() {
	      $("#loader").show();
	    }).ajaxStop(function() {
	      $("#loader").hide();
	    });
    
    $('#lookup').click(function(){
        var t = $('#target').val();
        $.post('onlineDictServlet',{'target':t})
                .done(ajaxSuccess)
                .fail(ajaxFailure);
    });
});
function ajaxSuccess(data){
    console.log("success");
    $("#defResult").text("");
    for( var i = 0 ; i < data.def.length; i++){
    $("#defResult").append(i+1+". "+data.type[i]+" "+data.def[i] + "</br></br>");
    
    
}
}
function ajaxFailure(){
    alert("faliure");
}