// Wait for the DOM to be ready
$(function() {
  // Initialize form validation on the registration form.
  // It has the name attribute "registration"
  $("form[name='contactInfo']").validate({
    // Specify validation rules
    rules: {
      // The key name on the left side is the name attribute
      // of an input field. Validation rules are defined
      // on the right side
      name: "required",
      
      email: {
        required: true,
        // Specify that email should be validated
        // by the built-in "email" rule
        number: true
      },
      password: {
        required: true,
        minlength: 10
      }
    },
    // Specify validation error messages
    messages: {
      name: "Please enter your firstname",
      number: {
        required: "Please enter your number",
        minlength: "Number must be at least 10 characters long"
      },
      email: "Please enter a valid email address"
    },
    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
      form.submit();
    }
  });
});