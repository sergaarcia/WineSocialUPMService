/**
 * WineSocialUPMMessageReceiverInOut.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package es.upm.etsiinf.sos;

/** WineSocialUPMMessageReceiverInOut message receiver */
public class WineSocialUPMMessageReceiverInOut
    extends org.apache.axis2.receivers.AbstractInOutMessageReceiver {

  public void invokeBusinessLogic(
      org.apache.axis2.context.MessageContext msgContext,
      org.apache.axis2.context.MessageContext newMsgContext)
      throws org.apache.axis2.AxisFault {

    try {

      // get the implementation class for the Web Service
      Object obj = getTheImplementationObject(msgContext);

      WineSocialUPMSkeleton skel = (WineSocialUPMSkeleton) obj;
      // Out Envelop
      org.apache.axiom.soap.SOAPEnvelope envelope = null;
      // Find the axisOperation that has been set by the Dispatch phase.
      org.apache.axis2.description.AxisOperation op =
          msgContext.getOperationContext().getAxisOperation();
      if (op == null) {
        throw new org.apache.axis2.AxisFault(
            "Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
      }

      java.lang.String methodName;
      if ((op.getName() != null)
          && ((methodName =
                  org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(
                      op.getName().getLocalPart()))
              != null)) {

        if ("getMyFollowers".equals(methodName)) {

          es.upm.etsiinf.sos.GetMyFollowersResponse getMyFollowersResponse57 = null;
          es.upm.etsiinf.sos.GetMyFollowers wrappedParam =
              (es.upm.etsiinf.sos.GetMyFollowers)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.GetMyFollowers.class);

          getMyFollowersResponse57 = skel.getMyFollowers(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  getMyFollowersResponse57,
                  false,
                  new javax.xml.namespace.QName(
                      "http://sos.etsiinf.upm.es", "getMyFollowersResponse"));
        } else if ("removeUser".equals(methodName)) {

          es.upm.etsiinf.sos.RemoveUserResponse removeUserResponse59 = null;
          es.upm.etsiinf.sos.RemoveUser wrappedParam =
              (es.upm.etsiinf.sos.RemoveUser)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.RemoveUser.class);

          removeUserResponse59 = skel.removeUser(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  removeUserResponse59,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "removeUserResponse"));
        } else if ("addFollower".equals(methodName)) {

          es.upm.etsiinf.sos.AddFollowerResponse addFollowerResponse61 = null;
          es.upm.etsiinf.sos.AddFollower wrappedParam =
              (es.upm.etsiinf.sos.AddFollower)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.AddFollower.class);

          addFollowerResponse61 = skel.addFollower(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  addFollowerResponse61,
                  false,
                  new javax.xml.namespace.QName(
                      "http://sos.etsiinf.upm.es", "addFollowerResponse"));
        } else if ("logout".equals(methodName)) {

          es.upm.etsiinf.sos.LogoutResponse logoutResponse63 = null;
          es.upm.etsiinf.sos.Logout wrappedParam =
              (es.upm.etsiinf.sos.Logout)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.Logout.class);

          logoutResponse63 = skel.logout(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  logoutResponse63,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "logoutResponse"));
        } else if ("removeWine".equals(methodName)) {

          es.upm.etsiinf.sos.RemoveWineResponse removeWineResponse65 = null;
          es.upm.etsiinf.sos.RemoveWine wrappedParam =
              (es.upm.etsiinf.sos.RemoveWine)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.RemoveWine.class);

          removeWineResponse65 = skel.removeWine(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  removeWineResponse65,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "removeWineResponse"));
        } else if ("getMyRates".equals(methodName)) {

          es.upm.etsiinf.sos.GetMyRatesResponse getMyRatesResponse67 = null;
          es.upm.etsiinf.sos.GetMyRates wrappedParam =
              (es.upm.etsiinf.sos.GetMyRates)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.GetMyRates.class);

          getMyRatesResponse67 = skel.getMyRates(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  getMyRatesResponse67,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getMyRatesResponse"));
        } else if ("unfollow".equals(methodName)) {

          es.upm.etsiinf.sos.UnfollowResponse unfollowResponse69 = null;
          es.upm.etsiinf.sos.Unfollow wrappedParam =
              (es.upm.etsiinf.sos.Unfollow)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.Unfollow.class);

          unfollowResponse69 = skel.unfollow(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  unfollowResponse69,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "unfollowResponse"));
        } else if ("addUser".equals(methodName)) {

          es.upm.etsiinf.sos.AddUserResponse addUserResponse71 = null;
          es.upm.etsiinf.sos.AddUser wrappedParam =
              (es.upm.etsiinf.sos.AddUser)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.AddUser.class);

          addUserResponse71 = skel.addUser(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  addUserResponse71,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "addUserResponse"));
        } else if ("rateWine".equals(methodName)) {

          es.upm.etsiinf.sos.RateWineResponse rateWineResponse73 = null;
          es.upm.etsiinf.sos.RateWine wrappedParam =
              (es.upm.etsiinf.sos.RateWine)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.RateWine.class);

          rateWineResponse73 = skel.rateWine(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  rateWineResponse73,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "rateWineResponse"));
        } else if ("addWine".equals(methodName)) {

          es.upm.etsiinf.sos.AddWineResponse addWineResponse75 = null;
          es.upm.etsiinf.sos.AddWine wrappedParam =
              (es.upm.etsiinf.sos.AddWine)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.AddWine.class);

          addWineResponse75 = skel.addWine(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  addWineResponse75,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "addWineResponse"));
        } else if ("getWines".equals(methodName)) {

          es.upm.etsiinf.sos.GetWinesResponse getWinesResponse77 = null;
          es.upm.etsiinf.sos.GetWines wrappedParam =
              (es.upm.etsiinf.sos.GetWines)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.GetWines.class);

          getWinesResponse77 = skel.getWines(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  getWinesResponse77,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "getWinesResponse"));
        } else if ("changePassword".equals(methodName)) {

          es.upm.etsiinf.sos.ChangePasswordResponse changePasswordResponse79 = null;
          es.upm.etsiinf.sos.ChangePassword wrappedParam =
              (es.upm.etsiinf.sos.ChangePassword)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.ChangePassword.class);

          changePasswordResponse79 = skel.changePassword(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  changePasswordResponse79,
                  false,
                  new javax.xml.namespace.QName(
                      "http://sos.etsiinf.upm.es", "changePasswordResponse"));
        } else if ("login".equals(methodName)) {

          es.upm.etsiinf.sos.LoginResponse loginResponse81 = null;
          es.upm.etsiinf.sos.Login wrappedParam =
              (es.upm.etsiinf.sos.Login)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.Login.class);

          loginResponse81 = skel.login(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  loginResponse81,
                  false,
                  new javax.xml.namespace.QName("http://sos.etsiinf.upm.es", "loginResponse"));
        } else if ("getMyFollowerRates".equals(methodName)) {

          es.upm.etsiinf.sos.GetMyFollowerRatesResponse getMyFollowerRatesResponse83 = null;
          es.upm.etsiinf.sos.GetMyFollowerRates wrappedParam =
              (es.upm.etsiinf.sos.GetMyFollowerRates)
                  fromOM(
                      msgContext.getEnvelope().getBody().getFirstElement(),
                      es.upm.etsiinf.sos.GetMyFollowerRates.class);

          getMyFollowerRatesResponse83 = skel.getMyFollowerRates(wrappedParam);

          envelope =
              toEnvelope(
                  getSOAPFactory(msgContext),
                  getMyFollowerRatesResponse83,
                  false,
                  new javax.xml.namespace.QName(
                      "http://sos.etsiinf.upm.es", "getMyFollowerRatesResponse"));

        } else {
          throw new java.lang.RuntimeException("method not found");
        }

        newMsgContext.setEnvelope(envelope);
      }
    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  //
  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyFollowers param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyFollowers.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyFollowersResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyFollowersResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RemoveUser param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RemoveUser.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RemoveUserResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RemoveUserResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddFollower param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddFollower.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddFollowerResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddFollowerResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.Logout param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.Logout.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.LogoutResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.LogoutResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RemoveWine param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RemoveWine.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RemoveWineResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RemoveWineResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyRates param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyRates.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyRatesResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyRatesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.Unfollow param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.Unfollow.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.UnfollowResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.UnfollowResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddUser param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddUser.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddUserResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddUserResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RateWine param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RateWine.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.RateWineResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.RateWineResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddWine param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddWine.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.AddWineResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.AddWineResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetWines param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetWines.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetWinesResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetWinesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.ChangePassword param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.ChangePassword.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.ChangePasswordResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.ChangePasswordResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.Login param, boolean optimizeContent) throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.Login.MY_QNAME, org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.LoginResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.LoginResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyFollowerRates param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyFollowerRates.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      es.upm.etsiinf.sos.GetMyFollowerRatesResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          es.upm.etsiinf.sos.GetMyFollowerRatesResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.GetMyFollowersResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(es.upm.etsiinf.sos.GetMyFollowersResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.GetMyFollowersResponse wrapgetMyFollowers() {
    es.upm.etsiinf.sos.GetMyFollowersResponse wrappedElement =
        new es.upm.etsiinf.sos.GetMyFollowersResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.RemoveUserResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.RemoveUserResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.RemoveUserResponse wrapremoveUser() {
    es.upm.etsiinf.sos.RemoveUserResponse wrappedElement =
        new es.upm.etsiinf.sos.RemoveUserResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.AddFollowerResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.AddFollowerResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.AddFollowerResponse wrapaddFollower() {
    es.upm.etsiinf.sos.AddFollowerResponse wrappedElement =
        new es.upm.etsiinf.sos.AddFollowerResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.LogoutResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.LogoutResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.LogoutResponse wraplogout() {
    es.upm.etsiinf.sos.LogoutResponse wrappedElement = new es.upm.etsiinf.sos.LogoutResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.RemoveWineResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.RemoveWineResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.RemoveWineResponse wrapremoveWine() {
    es.upm.etsiinf.sos.RemoveWineResponse wrappedElement =
        new es.upm.etsiinf.sos.RemoveWineResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.GetMyRatesResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.GetMyRatesResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.GetMyRatesResponse wrapgetMyRates() {
    es.upm.etsiinf.sos.GetMyRatesResponse wrappedElement =
        new es.upm.etsiinf.sos.GetMyRatesResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.UnfollowResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.UnfollowResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.UnfollowResponse wrapunfollow() {
    es.upm.etsiinf.sos.UnfollowResponse wrappedElement = new es.upm.etsiinf.sos.UnfollowResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.AddUserResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.AddUserResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.AddUserResponse wrapaddUser() {
    es.upm.etsiinf.sos.AddUserResponse wrappedElement = new es.upm.etsiinf.sos.AddUserResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.RateWineResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.RateWineResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.RateWineResponse wraprateWine() {
    es.upm.etsiinf.sos.RateWineResponse wrappedElement = new es.upm.etsiinf.sos.RateWineResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.AddWineResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.AddWineResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.AddWineResponse wrapaddWine() {
    es.upm.etsiinf.sos.AddWineResponse wrappedElement = new es.upm.etsiinf.sos.AddWineResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.GetWinesResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.GetWinesResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.GetWinesResponse wrapgetWines() {
    es.upm.etsiinf.sos.GetWinesResponse wrappedElement = new es.upm.etsiinf.sos.GetWinesResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.ChangePasswordResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(es.upm.etsiinf.sos.ChangePasswordResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.ChangePasswordResponse wrapchangePassword() {
    es.upm.etsiinf.sos.ChangePasswordResponse wrappedElement =
        new es.upm.etsiinf.sos.ChangePasswordResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.LoginResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(param.getOMElement(es.upm.etsiinf.sos.LoginResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.LoginResponse wraplogin() {
    es.upm.etsiinf.sos.LoginResponse wrappedElement = new es.upm.etsiinf.sos.LoginResponse();
    return wrappedElement;
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      es.upm.etsiinf.sos.GetMyFollowerRatesResponse param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {
    try {
      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();

      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(es.upm.etsiinf.sos.GetMyFollowerRatesResponse.MY_QNAME, factory));

      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private es.upm.etsiinf.sos.GetMyFollowerRatesResponse wrapgetMyFollowerRates() {
    es.upm.etsiinf.sos.GetMyFollowerRatesResponse wrappedElement =
        new es.upm.etsiinf.sos.GetMyFollowerRatesResponse();
    return wrappedElement;
  }

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (es.upm.etsiinf.sos.AddFollower.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddFollower.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.AddFollowerResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddFollowerResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.AddUser.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddUser.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.AddUserResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddUserResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.AddWine.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddWine.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.AddWineResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.AddWineResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.ChangePassword.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.ChangePassword.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.ChangePasswordResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.ChangePasswordResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyFollowerRates.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetMyFollowerRates.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyFollowerRatesResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result =
            es.upm.etsiinf.sos.GetMyFollowerRatesResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyFollowers.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetMyFollowers.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyFollowersResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetMyFollowersResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyRates.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetMyRates.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetMyRatesResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetMyRatesResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetWines.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetWines.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.GetWinesResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.GetWinesResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.Login.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.Login.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.LoginResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.LoginResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.Logout.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.Logout.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.LogoutResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.LogoutResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RateWine.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RateWine.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RateWineResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RateWineResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RemoveUser.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RemoveUser.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RemoveUserResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RemoveUserResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RemoveWine.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RemoveWine.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.RemoveWineResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.RemoveWineResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.Unfollow.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.Unfollow.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (es.upm.etsiinf.sos.UnfollowResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        java.lang.Object result = es.upm.etsiinf.sos.UnfollowResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (java.lang.Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }

  private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
    org.apache.axis2.AxisFault f;
    Throwable cause = e.getCause();
    if (cause != null) {
      f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
    } else {
      f = new org.apache.axis2.AxisFault(e.getMessage());
    }

    return f;
  }
} // end of class
