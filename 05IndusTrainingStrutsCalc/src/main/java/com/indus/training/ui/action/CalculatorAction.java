package com.indus.training.ui.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.indus.training.ui.model.CalcInputs;
import com.indus.training.ui.model.CalcOutputs;

public class CalculatorAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		CalcInputs calInObj = (CalcInputs) form;
		CalcOutputs calOutObj = null;
		Double result = null;
		if (calInObj != null) {
			String param1 = calInObj.getParam1();
			String param2 = calInObj.getParam2();
			String operation = calInObj.getOperation();
			calOutObj = new CalcOutputs();
			calOutObj.setParam1(param1);
			calOutObj.setParam2(param2);
			if (param1 != null && !param1.isEmpty() && param2 != null && !param2.isEmpty() && operation != null
					&& !operation.isEmpty()) {
				result = Double.valueOf(param1) + Double.valueOf(param2);
				calOutObj.setResult(result.toString());
			}
		}
		request.setAttribute("calciOutputForm", calOutObj);
		return mapping.findForward("success");
	}

}
