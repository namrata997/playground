// $('.save-button').click(function () {
//     // Now the div itself as an object is $(this) or this
//     // Example:
//     $(this).text('Saved').css('background', 'yellow');
// });


// $('.draggable').draggable();

$('#disable').click(function(e) {
    $('.draggable').draggable('disable');
    $('.draggable').removeClass('active').addClass('inactive');
});

$('#enable').click(function(e) {
    $('.draggable').draggable('enable');
    $('.draggable').removeClass('inactive').addClass('active');
});