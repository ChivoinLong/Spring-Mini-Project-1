/*

 App Name    : Bycicle - Responsive Admin Theme
 Author      : Pixelfarm.in
 Author URI  : http://Pixelfarm.in/

 */


var FormValidationInline = function () {

    var handelFormValidation = function () {

        // validate signup form on keyup and submit
        $(".form-validate").validate({
            errorElement: 'span', //default input error message container
            errorClass: 'error', // default input error message class
            focusInvalid: false, // do not focus the last invalid input
            ignore: "",

            rules: {
                username: {
                    required: true
                },
                email: {
                    required: true
                },
                phoneNumber: {
                    required: true
                }
            },

            messages: {
                username: "Please enter username",
                email: "Please enter email",
                phoneNumber: "Please enter phone number"
            },
            highlight: function (element) { // hightlight error inputs
                $(element)
                    .closest('.form-group').addClass('has-error'); // set error class to the control group
            },
            unhighlight: function (element) { // revert the change done by hightlight
                $(element)
                    .closest('.form-group').removeClass('has-error'); // set error class to the control group
            }
        });
    };

    return {
        init: function () {
            handelFormValidation();
        }

    };
}();    // Handel Form Validation

var FormValidationTooltip = function () {

    var handelFormValidation = function () {
        $("#formvalidationtooltip").validationEngine();
    };

    return {
        init: function () {
            handelFormValidation();
        }

    };
}();    // Handel Form Validation

