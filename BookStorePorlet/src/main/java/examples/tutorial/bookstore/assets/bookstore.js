
$(document).ready(function(){
	
	$('a[name=modal]').click(function(e) {
		alert("hello");
		alert(${book.name});
	});
	
	
	
	/*//select all the a tag with name equal to modal
    $('a[name=modal]').click(function(e) {
    //Cancel the link behavior
    e.preventDefault();
    //Get the A tag
    //var id = $(this).attr('href');
    //alert(id);
    //Get the screen height and width
    document.getElementById('boxes').appendChild(divElement);
	var maskHeight = $(window).height();
	var maskWidth = $(window).width();
	 
	//Set height and width to mask to fill up the whole screen
	$('#mask').css({'width':maskWidth,'height':maskHeight});
	     
	//transition effect    
	$('#mask').fadeIn(1000);   
	$('#mask').fadeTo("slow",0.8); 
	 
	//Get the window height and width
	var winH = $(window).height();
	var winW = $(window).width();
 
    //transition effect
    //$(id).fadeIn(2000);
    });
    //if close button is clicked
    $('.window .close').click(function (e) {
        //Cancel the link behavior
        e.preventDefault();
        $('#mask, .window').hide();
    });    
     
    //if mask is clicked
    $('#mask').click(function () {
        $(this).hide();
        $('.window').hide();
    }); 
	*/
//open popup
$(".ajoutbook .btn").click(function(){
	$("#myform1").fadeIn(1000);
	positionPopup();
});

$('a[name=modal2]').click(function(){
	$("myform2").fadeIn(1000);
	positionPopup();
});


//close popup
$(".popup .close").click(function(){
$("#myform1").fadeOut(500);
});

});

//position the popup at the center of the page
function positionPopup(){
if(!$(".myform").is(':visible')){
return;
}
$(".myform").css({
left: ($(window).width() - $('.myform').width()) / 4,
top: ($(window).width() - $('.myform').width()) / 15,
position:'absolute'
});
}
 
//maintain the popup at center of the page when browser resized
$(window).bind('resize',positionPopup);

function confirmDelete(){
	var agree=CONFIRM("Are you sure you want to delete this file?");
	if (agree)
	     return true ;
	else
	     return false ;
	}
function closePopup(){
	$(".myform").fadeOut(500);
}


/*function CreateDivElement(content) { 
	
	var divElement = document.createElement("div");
	divElement.setAttribute("class","window");
	divElement.setAttribute("id","dialog");
	divElement.innerHTML = "<p><Strong>Book Content : </Strong></p>";   
	//document.body.appendChild(divElement); 
	document.getElementById('boxes').appendChild(divElement);
	//Set the popup window to center

	divElement.css('style',"display:block");
	$("#dialog").fadeIn(1000);
	
	}  */
function openContent(){
	$("#dialog").fadeOut(500);
}

function CreateFormElement(id,name,category,content){
	var form = document.createElement("form"); 
	form.setAttribute("method", "post");
    form.setAttribute("action", "@{modifyBook(id = book.id)}"); 
    form.setAttribute("id","myform");
    form.setAttribute("class","myform");
	form.innerHTML ="<p><a href='#' onClick='closePopup()' name='close2' id='close2'/>x</a></p>" +
					"<p><strong>Name: <br/></strong>" +
					"<input type='text' name='name' size='16' value="+name+"></p>" +
					"<p><strong>Category: <br/></strong>" +
					"<select name='category'>" +
					"<option  selected='selected' value="+category+">"+category+"</option>+" +
					"<option value='NOVEL'>NOVEL</option>"+
						"<option value='MANGA'>MANGA</option>"+
						"<option value='COMICS'>COMICS</option>"+
						"<option value='TECHNICAL'>TECHNICAL</option>"+
						"<option value='MATHS'>MATHS</option>"+
						"<option value='HISTORY'>HISTORY</option>"+
					"</select></p>"+
					"<p><strong>Content: <br/></strong><textarea cols='20' rows='5' name='content'>${book.content}</textarea></p>"+
					"<button type='submit' class='btn'>Add</button>"+
					"<button type='reset' class='btn'>Reset</button>";
					



					
	document.getElementById('myform3').appendChild(form);
	//document.body.appendChild(form);
	
 /*   newinput = document.createElement('input');
    newinput.setAttribute('type','text');
    newinput.setAttribute('name','name');
    newinput.setAttribute('value',name);
    document.body.appendChild(newinput);*/
	
	//divElement.innerHTML = "Hello "+content;*/

}



