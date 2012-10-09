
$(document).ready(function(){
	
//open popup
$("#btn1").click(function(){
	$("#myform1").fadeIn(1000);
	positionPopup();
	document.getElementById("overlay").style.display = "block";
});
//close popup
$(".popup #close").click(function(){
$("#myform1").fadeOut(500);
document.getElementById("overlay").style.display = "none";
});

$("#close2").live("click", function(){
	$("#content").fadeOut(1000);
	document.getElementById("overlay").style.display = "none";
});

// Search function
var search = function(elt) {
  var root = $(elt).jz();
  root.find(".result").jzLoad("Hotels.list()", {
    search : $(elt).jzFind(".search").val(),
    size : $(elt).jzFind(".size").val(),
    page : $(elt).jzFind(".page").val()
  }, function() {
    // does not seem used
    // $('#content').css('visibility', 'visible');
  });
};
// Events handler
$("body").on("click", ".jz .submit", function() {
  $(this).jzFind('.page').val(0);
  search(this);
});
$("body").on("keyup", ".jz .search", function() {
  $(this).jzFind('.page').val(0);
  search(this);
});
$("body").on("click", ".jz .nextPage", function(e) {
  var p = $(this).attr('href');
  $(this).jzFind('.page').val(p);
  e.preventDefault();
  search(this);
});



});

//position the popup at the center of the page
function positionPopup(){
if(!$(".popup").is(':visible')){
return;
}
$(".popup").css({
left: ($(window).width() - $('.popup').width()) / 3,
top: ($(window).width() - $('.popup').width()) / 15,
position:'absolute'
});
}

function showContent(name,content){
	var divElement = document.createElement("div");
	divElement.setAttribute("class","content");
	divElement.innerHTML = "<h1><Strong>" + name +"</Strong></h1>"+"</br>"+content + "</br><button class='button' id='close2'>close</button>";
	document.getElementById('content').appendChild(divElement);
	$("#content").fadeIn(1000);
	positionPopup();
	document.getElementById("overlay").style.display = "block";
}
function editBook(id){
	alert("id");
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
/*function closePopup(){
	alert('he');
	$(".popup").fadeOut(1000);
	
}*/


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



