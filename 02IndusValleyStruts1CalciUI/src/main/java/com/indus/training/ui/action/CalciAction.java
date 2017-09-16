package com.indus.training.ui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.indus.training.service.ICalci;
import com.indus.training.ui.model.CalciInput;
import com.indus.training.ui.model.CalciOutput;

public class CalciAction extends DispatchAction {
	
	private ICalci calObj;

	public void setCalObj(ICalci calObj) {
		this.calObj = calObj;
	}

	
	

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		CalciInput calInObj = (CalciInput) form;
		CalciOutput calOutObj = null;
		Double result = null;

		if (calInObj != null) {
			String param1 = calInObj.getParam1();
			String param2 = calInObj.getParam2();
			String operation = calInObj.getOperation();

			calOutObj = new CalciOutput();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			calOutObj.setOperation(operation);

			if (param1 != null && !param1.isEmpty() && param2 != null && !param2.isEmpty() && operation != null
					&& !operation.isEmpty()) {
				if ("addition".equals(operation)) {
					result = calObj.addition(Double.valueOf(param1), Double.valueOf(param2));
				} else if ("subtraction".equals(operation)) {
					result = calObj.subtract(Double.valueOf(param1), Double.valueOf(param2));
				} else if ("Multiplication".equals(operation)) {
					result = calObj.multiply(Double.valueOf(param1), Double.valueOf(param2));
				} else if ("Division".equals(operation)) {
					result = calObj.division(Double.valueOf(param1), Double.valueOf(param2));
				}

				calOutObj.setResult(result.toString());
			}
		}
		request.setAttribute("calciOutputForm", calOutObj);
		return mapping.findForward("success");
	}
	
	
}
