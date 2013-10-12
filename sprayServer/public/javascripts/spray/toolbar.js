var SPRAY = SPRAY || {};
SPRAY.htwg = SPRAY.htwg || {};

SPRAY.htwg.spray = SPRAY.htwg.spray || {};

// class: Menu

SPRAY.htwg.spray.Toolbar = function($){

    if ( jQuery('#toolbar').length === 0 ) {
        //no need to initialize
        return false;
    };

    /**
     * Scope duplicator / parent this
     *
     * @var
     * @access private
     * @type object
     */
    var that = this;

    this.menu = jQuery("#toolbar");

    this.view = SPRAY.htwg.view;

    this.initialize = function(){

        // register this class as event listener for the canvas
        // CommandStack. This is required to update the state of
        // the Undo/Redo Buttons.
        //
        //SPRAY.htwg.view.getCommandStack().addEventListener(this);

        // Register a Selection listener for the state hnadling
        // of the Delete Button
        //
        //SPRAY.htwg.view.addSelectionListener(this);

        // Inject the UNDO Button and the callbacks
        //
        this.undoButton  = $("#undo");
        this.undoButton.click($.proxy(function(){
            that.view.getCommandStack().undo();
        },this));

        // Inject the REDO Button and the callback
        //
        this.redoButton  = $("#redo");
        this.redoButton.click($.proxy(function(){
            that.view.getCommandStack().redo();
        },this));

    };

    this.initialize();
};