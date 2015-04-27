import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import oracle.adf.controller.ControllerContext;

public class ExcpetionHandleBe {
    public ExcpetionHandleBe() {
    }

    public void handleExceptionShowMessageInPopupDialog() {
        System.out.println("DDDDDDDDDDDDDDDDDDdddddddddd");
           ControllerContext cc = ControllerContext.getInstance();

           Exception ex = cc.getCurrentViewPort().getExceptionData();
           String message = ex.getMessage();


           FacesContext fc = FacesContext.getCurrentInstance();
           FacesMessage facesMessage =
             new FacesMessage(FacesMessage.SEVERITY_ERROR, "UTF: " + message, null);
           fc.addMessage(null, facesMessage);

           cc.getCurrentRootViewPort().clearException();
           fc.renderResponse();
  // Add event code here...
    }
 

    public void throwExcep(ActionEvent actionEvent) {
        throw new NullPointerException("nully2");
    }
}
