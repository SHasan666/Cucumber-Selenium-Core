
jQuery(document).ready(function() {

    /*
        Fullscreen background
    */
    //$.backstretch("assets/img/backgrounds/griffin-keller-385.jpg");

    /*
        Login form validation
    */
    $('.login-form input[type="text"], .login-form input[type="email"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    
    	$(this).removeClass('input-error');
    });

    $('.login-form').on('submit', function(e) 
    	{

    	$(this).find('input[type="text"], input[type="password"], input[type="email"], textarea').each(function()
      {
    		if( $(this).val() == "" )
        {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}else
        {
    			$(this).removeClass('input-error');
    		}
    	});

     /* if( !($(this).find('input[type="email"]').val() == "sakibhasan.net@gmail.com"  && $(this).find('input[type="password"]').val() == "sakib" ))
      {
        e.preventDefault();
        $('.alert-danger').show();
      }else
      {
        $('.alert-danger').hide();
      }
*/

    });

    /*
        Registration form validation
    */
    $('.registration-form input[type="text"], .registration-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });

    $('.registration-form').on('submit', function(e) {

    	$(this).find('input[type="text"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});

    });


});
