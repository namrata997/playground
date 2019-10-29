$(function() {
  function addImage(u, c, t) {
    /***
    Input: URL, Class, Target Object
    Output: jQuery Object of IMG element
    ***/
    if (u == undefined) {
      u = "go.png";
    }
    if (c == undefined) {
      c == "";
    }
    if (t == undefined) {
      t = $("#zone");
    }
    var img = $("<img>", {
      src: u,
      class: c,
    }).css({
      width: "50px",
      height: "100px"
    });
    img.appendTo(t);
    return img;
  }

  function makeDrag(o) {
    /***
    Input: jQuery Object
    Output: null
    ***/
    o.draggable({
      containment: "parent"
    });
  }

  $("#add-object").click(function() {
    makeDrag(addImage("go.png", "foo"));
  });
});
