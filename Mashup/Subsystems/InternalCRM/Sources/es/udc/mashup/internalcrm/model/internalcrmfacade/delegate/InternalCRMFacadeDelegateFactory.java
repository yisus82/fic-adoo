package es.udc.mashup.internalcrm.model.internalcrmfacade.delegate;

import es.udc.ws.util.configuration.ConfigurationParametersManager;
import es.udc.ws.util.exceptions.ServiceException;

public class InternalCRMFacadeDelegateFactory {

	private final static String DELEGATE_CLASS_NAME_PARAMETER = "InternalCRMFacadeDelegateFactory/delegateClassName";

	private static Class delegateClass;

	private static Class getDelegateClass() {

		if (delegateClass == null) {
			String delegateClassName = ConfigurationParametersManager
					.getParameter(DELEGATE_CLASS_NAME_PARAMETER);
			try {
				delegateClass = Class.forName(delegateClassName);
			} catch (ClassNotFoundException e) {
				throw new ServiceException("Can not create instance of "
						+ InternalCRMFacadeDelegate.class);
			}
		}

		return delegateClass;

	}

	public final static InternalCRMFacadeDelegate getInternalCRMFacadeDelegate()
			throws ServiceException {

		try {
			return (InternalCRMFacadeDelegate) getDelegateClass().newInstance();
		} catch (Exception e) {
			throw new ServiceException(e);
		}

	}

	private InternalCRMFacadeDelegateFactory() {
	}

}
