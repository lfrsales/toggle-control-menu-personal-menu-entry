package com.liferay.users.admin.web.internal.product.navigation.personal.menu;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.SessionClicks;
import com.liferay.product.navigation.personal.menu.PersonalMenuEntry;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.osgi.service.component.annotations.Component;

/**
 * @author Evan Thibodeau
 */
@Component(
	immediate = true,
	property = {
		"product.navigation.personal.menu.entry.order:Integer=100",
		"product.navigation.personal.menu.group:Integer=399"
	},
	service = PersonalMenuEntry.class
)
public class ToggleControlMenuPersonalMenuEntry implements PersonalMenuEntry {

	@Override
	public String getLabel(Locale locale) {
		return LanguageUtil.get(locale, "toggle-control-menu");
	}

	@Override
	public String getPortletURL(HttpServletRequest httpServletRequest)
		throws PortalException {
		
		boolean showControlMenu = GetterUtil.getBoolean(
			SessionClicks.get(
				httpServletRequest, "SHOW_CONTROL_MENU", "default"));

		String showControlMenuNext = showControlMenu ? "false" : "true";

		return "javascript: Liferay.Store('SHOW_CONTROL_MENU', '" +
			showControlMenuNext + "'); setTimeout(() => location.reload(), 0);";
	}

}