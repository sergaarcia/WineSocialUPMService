/**
 * WineSocialUPMSkeleton.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package es.upm.etsiinf.sos;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponseBackEnd;
import es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE;
import es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd;

/** WineSocialUPMSkeleton java skeleton for the axisService */
public class WineSocialUPMSkeleton {

	private UPMAuthenticationAuthorizationWSSkeletonStub authStub;
	private static es.upm.etsiinf.sos.model.xsd.User currentUser;
	private static es.upm.etsiinf.sos.model.xsd.User admin;
	private static final String ADMIN_USERNAME = "admin";
	private static String ADMIN_PASSWORD = "admin";
	private static Set<String> usuarios;
	private static Map<String, Set<String>> seguidores;

	public WineSocialUPMSkeleton() {
		try {
			authStub = new UPMAuthenticationAuthorizationWSSkeletonStub();
			admin = new es.upm.etsiinf.sos.model.xsd.User();
			admin.setName(ADMIN_USERNAME);
			admin.setPwd(ADMIN_PASSWORD);
			usuarios = new HashSet<>();
			seguidores = new HashMap<>();
//			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.Login login = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.Login();
//			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd l = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd();
//			l.setName(admin.getName());
//			l.setPassword(admin.getPwd());
//			login.setLogin(l);
//			authStub.login(login);
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Auto generated method signature
	 *
	 * @param getMyFollowers
	 * @return getMyFollowersResponse
	 */
	public es.upm.etsiinf.sos.GetMyFollowersResponse getMyFollowers(es.upm.etsiinf.sos.GetMyFollowers getMyFollowers) {

		es.upm.etsiinf.sos.GetMyFollowersResponse r = new es.upm.etsiinf.sos.GetMyFollowersResponse();
		es.upm.etsiinf.sos.model.xsd.FollowerList list = new es.upm.etsiinf.sos.model.xsd.FollowerList();

		if (currentUser == null) {
			list.setResult(false);
			r.set_return(list);
			return r;
		}
		
		list.setFollowers(seguidores.get(currentUser.getName()).toArray(new String[0]));
		list.setResult(true);
		r.set_return(list);

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param removeUser
	 * @return removeUserResponse
	 */
	public es.upm.etsiinf.sos.RemoveUserResponse removeUser(es.upm.etsiinf.sos.RemoveUser removeUser) {
		// TODO : fill this with the necessary business logic
//		throw new java.lang.UnsupportedOperationException(
//				"Please implement " + this.getClass().getName() + "#removeUser");
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.etsiinf.sos.RemoveUserResponse r = new es.upm.etsiinf.sos.RemoveUserResponse();

//		if (currentUser != null && !currentUser.getName().equals(removeUser.getArgs0().getUsername())
//				&& !currentUser.getName().equals(ADMIN_USERNAME)
//				&& !removeUser.getArgs0().getUsername().equals(ADMIN_USERNAME)) {
//			response.setResponse(false);
//			r.set_return(response);
//			return r;
//		}
		if (currentUser == null || removeUser.getArgs0().getUsername().equals(ADMIN_USERNAME)
				|| (!currentUser.getName().equals(ADMIN_USERNAME)
						&& !currentUser.getName().equals(removeUser.getArgs0().getUsername()))) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}

		es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE u = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE();
		es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser user = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();
		user.setName(removeUser.getArgs0().getUsername());
		u.setRemoveUser(user);
		try {
			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE authResponse = authStub
					.removeUser(u);

			response.setResponse(authResponse.get_return().getResult());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addFollower
	 * @return addFollowerResponse
	 */
	public es.upm.etsiinf.sos.AddFollowerResponse addFollower(es.upm.etsiinf.sos.AddFollower addFollower) {
		es.upm.etsiinf.sos.AddFollowerResponse r = new es.upm.etsiinf.sos.AddFollowerResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		if (currentUser == null || !usuarios.contains(addFollower.getArgs0().getUsername())
				|| seguidores.get(currentUser.getName()).contains(addFollower.getArgs0().getUsername())) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}

		boolean result = seguidores.get(currentUser.getName()).add(addFollower.getArgs0().getUsername());

		response.setResponse(result);
		r.set_return(response);

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param logout
	 * @return logoutResponse
	 */
	public es.upm.etsiinf.sos.LogoutResponse logout(es.upm.etsiinf.sos.Logout logout) {

		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		es.upm.etsiinf.sos.LogoutResponse r = new es.upm.etsiinf.sos.LogoutResponse();

		if (currentUser == null) {
			response.setResponse(false);
		} else {
			currentUser = null;
			response.setResponse(true);
		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param removeWine
	 * @return removeWineResponse
	 */
	public es.upm.etsiinf.sos.RemoveWineResponse removeWine(es.upm.etsiinf.sos.RemoveWine removeWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#removeWine");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getMyRates
	 * @return getMyRatesResponse
	 */
	public es.upm.etsiinf.sos.GetMyRatesResponse getMyRates(es.upm.etsiinf.sos.GetMyRates getMyRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyRates");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param unfollow
	 * @return unfollowResponse
	 */
	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) {

		es.upm.etsiinf.sos.UnfollowResponse r = new es.upm.etsiinf.sos.UnfollowResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		if (currentUser == null || !usuarios.contains(unfollow.getArgs0().getUsername())
				|| !seguidores.get(currentUser.getName()).contains(unfollow.getArgs0().getUsername())) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}

		boolean result = seguidores.get(currentUser.getName()).remove(unfollow.getArgs0().getUsername());
		response.setResponse(result);
		r.set_return(response);

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addUser
	 * @return addUserResponse
	 */
	public es.upm.etsiinf.sos.AddUserResponse addUser(es.upm.etsiinf.sos.AddUser addUser) {

		es.upm.etsiinf.sos.model.xsd.AddUserResponse response = new es.upm.etsiinf.sos.model.xsd.AddUserResponse();
		es.upm.etsiinf.sos.AddUserResponse r = new es.upm.etsiinf.sos.AddUserResponse();

//		if (currentUser != null && !currentUser.getName().equals("admin")) {
//			response.setResponse(false);
//			r.set_return(response);
//			return r;
//		}

		if (currentUser == null || !currentUser.getName().equals(ADMIN_USERNAME)
				|| usuarios.contains(addUser.getArgs0().getUsername())) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}

		try {
			UserBackEnd user = new UserBackEnd();
			user.setName(addUser.getArgs0().getUsername());

			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser u = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.AddUser();
			u.setUser(user);
			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.AddUserResponse authResponse = authStub
					.addUser(u);

			response.setResponse(authResponse.get_return().getResult());
			response.setPwd(authResponse.get_return().getPassword());

			if (response.getResponse()) {
				usuarios.add(addUser.getArgs0().getUsername());
				seguidores.put(addUser.getArgs0().getUsername(), new HashSet<>());
			}
		} catch (AxisFault e) {
			e.printStackTrace();
			response.setResponse(false);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setResponse(false);
		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param rateWine
	 * @return rateWineResponse
	 */
	public es.upm.etsiinf.sos.RateWineResponse rateWine(es.upm.etsiinf.sos.RateWine rateWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#rateWine");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addWine
	 * @return addWineResponse
	 */
	public es.upm.etsiinf.sos.AddWineResponse addWine(es.upm.etsiinf.sos.AddWine addWine) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#addWine");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getWines
	 * @return getWinesResponse
	 */
	public es.upm.etsiinf.sos.GetWinesResponse getWines(es.upm.etsiinf.sos.GetWines getWines) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getWines");
	}

	/**
	 * Auto generated method signature
	 *
	 * @param changePassword
	 * @return changePasswordResponse
	 */
	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		es.upm.etsiinf.sos.ChangePasswordResponse r = new es.upm.etsiinf.sos.ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		if (currentUser == null) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}
		if (currentUser.getName().equals(ADMIN_USERNAME)) {
			if (changePassword.getArgs0().getOldpwd().equals(ADMIN_PASSWORD)) {
				ADMIN_PASSWORD = changePassword.getArgs0().getNewpwd();
				admin.setPwd(ADMIN_PASSWORD);
				response.setResponse(true);
				r.set_return(response);
				return r;
			} else {
				response.setResponse(false);
				r.set_return(response);
				return r;
			}
		}

		try {
			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword c = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePassword();
			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd changePasswordBackEnd = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordBackEnd();

			changePasswordBackEnd.setName(currentUser.getName());
			changePasswordBackEnd.setOldpwd(changePassword.getArgs0().getOldpwd());
			changePasswordBackEnd.setNewpwd(changePassword.getArgs0().getNewpwd());
			c.setChangePassword(changePasswordBackEnd);

			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.ChangePasswordResponseE authResponse = authStub
					.changePassword(c);

			response.setResponse(authResponse.get_return().getResult());
			r.set_return(response);
		} catch (AxisFault e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param login
	 * @return loginResponse
	 */
	public es.upm.etsiinf.sos.LoginResponse login(es.upm.etsiinf.sos.Login login) {

		es.upm.etsiinf.sos.LoginResponse r = new es.upm.etsiinf.sos.LoginResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();

		if (currentUser != null && currentUser.getName().equals(login.getArgs0().getName())) {
			response.setResponse(true);
			r.set_return(response);
			return r;
		}
		if (currentUser != null) {
			response.setResponse(false);
			r.set_return(response);
			return r;
		}
		if (login.getArgs0().getName().equals(ADMIN_USERNAME)) {
			if (login.getArgs0().getPwd().equals(ADMIN_PASSWORD)) {
//				currentUser = admin;
				currentUser = new es.upm.etsiinf.sos.model.xsd.User();
				currentUser.setName(ADMIN_USERNAME);
				currentUser.setPwd(ADMIN_PASSWORD);
				response.setResponse(true);
			} else {
				response.setResponse(false);
			}
			r.set_return(response);
			return r;
		}

		try {
//			authStub = new UPMAuthenticationAuthorizationWSSkeletonStub();

			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.Login l = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.Login();

			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd loginBackEnd = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.LoginBackEnd();
			loginBackEnd.setName(login.getArgs0().getName());
			loginBackEnd.setPassword(login.getArgs0().getPwd());
			l.setLogin(loginBackEnd);
			es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.LoginResponse authResponse = authStub
					.login(l);

			response.setResponse(authResponse.get_return().getResult());
			if (response.getResponse()) {
				currentUser = login.getArgs0();
			}

		} catch (RemoteException e) {
			e.printStackTrace();

		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getMyFollowerRates
	 * @return getMyFollowerRatesResponse
	 */
	public es.upm.etsiinf.sos.GetMyFollowerRatesResponse getMyFollowerRates(
			es.upm.etsiinf.sos.GetMyFollowerRates getMyFollowerRates) {
		// TODO : fill this with the necessary business logic
		throw new java.lang.UnsupportedOperationException(
				"Please implement " + this.getClass().getName() + "#getMyFollowerRates");
	}
}
