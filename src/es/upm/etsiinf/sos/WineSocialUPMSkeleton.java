/**
 * WineSocialUPMSkeleton.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.2 Built on : Jul 13,
 * 2022 (06:38:03 EDT)
 */
package es.upm.etsiinf.sos;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.axis2.AxisFault;

import es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.UserBackEnd;

/** WineSocialUPMSkeleton java skeleton for the axisService */
public class WineSocialUPMSkeleton {

	private static UPMAuthenticationAuthorizationWSSkeletonStub authStub;
	private es.upm.etsiinf.sos.model.xsd.User currentUser;
	private static es.upm.etsiinf.sos.model.xsd.User admin;
	private static final String ADMIN_USERNAME = "admin";
	private static String ADMIN_PASSWORD = "admin";
	private static List<String> usuarios = new ArrayList<>();
	private static Map<String, List<String>> seguidores = new LinkedHashMap<>();
	private static List<es.upm.etsiinf.sos.model.xsd.Wine> vinos = new ArrayList<>();
	private static Map<String, Map<es.upm.etsiinf.sos.model.xsd.Wine, Integer>> puntuaciones = new LinkedHashMap<>();
	// Usamos LinkedHashMap y ArrayList para las estructuras de datos para mantener
	// el orden de inserción, lo cual necesitaremos para ciertas funcionalidades

	public WineSocialUPMSkeleton() {
		try {
			if (authStub == null)
				authStub = new UPMAuthenticationAuthorizationWSSkeletonStub();
			if (admin == null) {
				admin = new es.upm.etsiinf.sos.model.xsd.User();
				admin.setName(ADMIN_USERNAME);
				admin.setPwd(ADMIN_PASSWORD);
			}
		} catch (AxisFault e) {
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

		es.upm.etsiinf.sos.RemoveUserResponse r = new es.upm.etsiinf.sos.RemoveUserResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (isAdmin() || isCurrentUser(removeUser.getArgs0().getUsername())) {
			try {
				es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE u = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserE();
				es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser user = new es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUser();
				user.setName(removeUser.getArgs0().getUsername());
				u.setRemoveUser(user);

				es.upm.etsiinf.sos.UPMAuthenticationAuthorizationWSSkeletonStub.RemoveUserResponseE authResponse = authStub
						.removeUser(u);
				boolean result = authResponse.get_return().getResult();
				if (result) {
					String username = removeUser.getArgs0().getUsername();
					usuarios.remove(username);
					seguidores.remove(username);
					puntuaciones.remove(username);

					for (List<String> listaSeguidores : seguidores.values()) {
						listaSeguidores.remove(username);
					}
				}
				response.setResponse(result);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
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
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (currentUser == null || currentUser.getName().equals(addFollower.getArgs0().getUsername())
				|| !usuarios.contains(addFollower.getArgs0().getUsername())
				|| seguidores.get(currentUser.getName()).contains(addFollower.getArgs0().getUsername())) {
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

		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);
		es.upm.etsiinf.sos.LogoutResponse r = new es.upm.etsiinf.sos.LogoutResponse();

		if (currentUser != null) {
			response.setResponse(true);
			currentUser = null;
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

		es.upm.etsiinf.sos.RemoveWineResponse r = new es.upm.etsiinf.sos.RemoveWineResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (isAdmin()) {
			es.upm.etsiinf.sos.model.xsd.Wine wineToRemove = null;
			for (es.upm.etsiinf.sos.model.xsd.Wine vino : vinos) {
				if (vino.getName().equals(removeWine.getArgs0().getName())
						&& vino.getGrape().equals(removeWine.getArgs0().getGrape())
						&& vino.getYear() == removeWine.getArgs0().getYear()) {
					wineToRemove = vino;
					break;
				}
			}

			if (wineToRemove != null) {
				vinos.remove(wineToRemove);

				for (Map<es.upm.etsiinf.sos.model.xsd.Wine, Integer> listaPuntuaciones : puntuaciones.values()) {
					listaPuntuaciones.remove(wineToRemove);
				}
				response.setResponse(true);
			}
		}

		r.set_return(response);

		return r;

	}

	/**
	 * Auto generated method signature
	 *
	 * @param getMyRates
	 * @return getMyRatesResponse
	 */
	public es.upm.etsiinf.sos.GetMyRatesResponse getMyRates(es.upm.etsiinf.sos.GetMyRates getMyRates) {

		es.upm.etsiinf.sos.GetMyRatesResponse r = new es.upm.etsiinf.sos.GetMyRatesResponse();
		es.upm.etsiinf.sos.model.xsd.WinesRatedList list = new es.upm.etsiinf.sos.model.xsd.WinesRatedList();

		if (currentUser == null) {
			list.setResult(false);
			r.set_return(list);
			return r;
		}

		Map<es.upm.etsiinf.sos.model.xsd.Wine, Integer> misPuntuaciones = puntuaciones.get(currentUser.getName());
		String[] names = new String[misPuntuaciones.size()];
		String[] grapes = new String[misPuntuaciones.size()];
		int[] years = new int[misPuntuaciones.size()];
		int[] rates = new int[misPuntuaciones.size()];

		int i = misPuntuaciones.size() - 1;
		for (Map.Entry<es.upm.etsiinf.sos.model.xsd.Wine, Integer> entry : misPuntuaciones.entrySet()) {
			es.upm.etsiinf.sos.model.xsd.Wine vino = entry.getKey();
			names[i] = vino.getName();
			grapes[i] = vino.getGrape();
			years[i] = vino.getYear();
			rates[i] = entry.getValue();
			i--;
		}

		list.setNames(names);
		list.setGrapes(grapes);
		list.setYears(years);
		list.setRates(rates);
		list.setResult(true);
		r.set_return(list);

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param unfollow
	 * @return unfollowResponse
	 */
	public es.upm.etsiinf.sos.UnfollowResponse unfollow(es.upm.etsiinf.sos.Unfollow unfollow) {

		es.upm.etsiinf.sos.UnfollowResponse r = new es.upm.etsiinf.sos.UnfollowResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (currentUser == null || !usuarios.contains(unfollow.getArgs0().getUsername())
				|| !seguidores.get(currentUser.getName()).contains(unfollow.getArgs0().getUsername())) {
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
		response.setResponse(false);

		if (isAdmin() && !usuarios.contains(addUser.getArgs0().getUsername())) {
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
					seguidores.put(addUser.getArgs0().getUsername(), new ArrayList<>());
					puntuaciones.put(addUser.getArgs0().getUsername(), new LinkedHashMap<>());
				}
			} catch (RemoteException e) {
				e.printStackTrace();
			}
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

		es.upm.etsiinf.sos.RateWineResponse r = new es.upm.etsiinf.sos.RateWineResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (currentUser != null) {
			for (es.upm.etsiinf.sos.model.xsd.Wine vino : vinos) {
				if (vino.getName().equals(rateWine.getArgs0().getName())
						&& vino.getGrape().equals(rateWine.getArgs0().getGrape())
						&& vino.getYear() == rateWine.getArgs0().getYear()) {
					puntuaciones.get(currentUser.getName()).put(vino, rateWine.getArgs0().getRate());
					response.setResponse(true);
					r.set_return(response);
					return r;
				}
			}
		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param addWine
	 * @return addWineResponse
	 */
	public es.upm.etsiinf.sos.AddWineResponse addWine(es.upm.etsiinf.sos.AddWine addWine) {

		es.upm.etsiinf.sos.AddWineResponse r = new es.upm.etsiinf.sos.AddWineResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (isAdmin()) {
			for (es.upm.etsiinf.sos.model.xsd.Wine vino : vinos) {
				if (vino.getName().equals(addWine.getArgs0().getName())
						&& vino.getGrape().equals(addWine.getArgs0().getGrape())
						&& vino.getYear() == addWine.getArgs0().getYear()) {
					r.set_return(response);
					return r;
				}
			}
			vinos.add(addWine.getArgs0());
			response.setResponse(true);
		}

		r.set_return(response);
		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param getWines
	 * @return getWinesResponse
	 */
	public es.upm.etsiinf.sos.GetWinesResponse getWines(es.upm.etsiinf.sos.GetWines getWines) {

		es.upm.etsiinf.sos.GetWinesResponse r = new es.upm.etsiinf.sos.GetWinesResponse();
		es.upm.etsiinf.sos.model.xsd.WineList list = new es.upm.etsiinf.sos.model.xsd.WineList();

		if (currentUser == null) {
			list.setResult(false);
			r.set_return(list);
			return r;
		}

		String[] names = new String[vinos.size()];
		String[] grapes = new String[vinos.size()];
		int[] years = new int[vinos.size()];

		for (int i = vinos.size() - 1, j = 0; i >= 0 && j < vinos.size(); i--, j++) {
			es.upm.etsiinf.sos.model.xsd.Wine vino = vinos.get(j);
			names[i] = vino.getName();
			grapes[i] = vino.getGrape();
			years[i] = vino.getYear();
		}

		list.setNames(names);
		list.setGrapes(grapes);
		list.setYears(years);
		list.setResult(true);
		r.set_return(list);

		return r;
	}

	/**
	 * Auto generated method signature
	 *
	 * @param changePassword
	 * @return changePasswordResponse
	 */
	public es.upm.etsiinf.sos.ChangePasswordResponse changePassword(es.upm.etsiinf.sos.ChangePassword changePassword) {
		es.upm.etsiinf.sos.ChangePasswordResponse r = new es.upm.etsiinf.sos.ChangePasswordResponse();
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);

		if (currentUser == null) {
			r.set_return(response);
			return r;
		}
		if (isAdmin()) {
			if (changePassword.getArgs0().getOldpwd().equals(ADMIN_PASSWORD)) {
				ADMIN_PASSWORD = changePassword.getArgs0().getNewpwd();
				admin.setPwd(ADMIN_PASSWORD);
				response.setResponse(true);
				r.set_return(response);
				return r;
			}
			r.set_return(response);
			return r;
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
		es.upm.etsiinf.sos.model.xsd.Response response = createResponse(false);
		
		if (isCurrentUser(login.getArgs0().getName())) {
			response.setResponse(true);
			r.set_return(response);
			return r;
		}
		if (currentUser != null) {
			r.set_return(response);
			return r;
		}
		if (login.getArgs0().getName().equals(ADMIN_USERNAME)) {
			if (login.getArgs0().getPwd().equals(ADMIN_PASSWORD)) {
				currentUser = admin;
				response.setResponse(true);
			}
			r.set_return(response);
			return r;
		}

		try {
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

		es.upm.etsiinf.sos.GetMyFollowerRatesResponse r = new es.upm.etsiinf.sos.GetMyFollowerRatesResponse();
		es.upm.etsiinf.sos.model.xsd.WinesRatedList list = new es.upm.etsiinf.sos.model.xsd.WinesRatedList();

		if (currentUser == null
				|| !seguidores.get(currentUser.getName()).contains(getMyFollowerRates.getArgs0().getUsername())) {
			list.setResult(false);
			r.set_return(list);
			return r;
		}

		Map<es.upm.etsiinf.sos.model.xsd.Wine, Integer> seguidorPuntuaciones = puntuaciones
				.get(getMyFollowerRates.getArgs0().getUsername());
		String[] names = new String[seguidorPuntuaciones.size()];
		String[] grapes = new String[seguidorPuntuaciones.size()];
		int[] years = new int[seguidorPuntuaciones.size()];
		int[] rates = new int[seguidorPuntuaciones.size()];

		int i = seguidorPuntuaciones.size() - 1;
		for (Map.Entry<es.upm.etsiinf.sos.model.xsd.Wine, Integer> entry : seguidorPuntuaciones.entrySet()) {
			es.upm.etsiinf.sos.model.xsd.Wine vino = entry.getKey();
			names[i] = vino.getName();
			grapes[i] = vino.getGrape();
			years[i] = vino.getYear();
			rates[i] = entry.getValue();
			i--;
		}

		list.setNames(names);
		list.setGrapes(grapes);
		list.setYears(years);
		list.setRates(rates);
		list.setResult(true);
		r.set_return(list);

		return r;
	}

	private es.upm.etsiinf.sos.model.xsd.Response createResponse(boolean result) {
		es.upm.etsiinf.sos.model.xsd.Response response = new es.upm.etsiinf.sos.model.xsd.Response();
		response.setResponse(result);
		return response;
	}

	private boolean isAdmin() {
		return currentUser != null && ADMIN_USERNAME.equals(currentUser.getName());
	}

	private boolean isCurrentUser(String username) {
		return currentUser != null && currentUser.getName().equals(username);
	}
}
