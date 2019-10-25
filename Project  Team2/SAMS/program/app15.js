var oldEvent = (window.onload) ? window.onload : function () {};
window.onload = function () {
   	oldEvent();
	document.getElementById("btnConfirm").onclick = null;
	}