# Toggle Control Menu Personal Menu Entry (Liferay 7.3)

Adds an additional item to the personal menu that allows you to show and hide the control menu. This module requires the use of the [Formed Theme](https://github.com/lfrsales/73-formed-theme) to apply a class to hide the control menu in the theme template.

## How to Build and Deploy

First, make sure you have blade installed and updated. You can updated blade by running `blade update`.

To Deploy run `blade deploy`.

This will deploy the module to the directory configured in `gradle.properties` under the property `liferay.workspace.home.dir`. The default assumes there is a Liferay instance in the `/bundles` directory.

You can change this in `gradle.properties`, but it's best to add a `gradle-local.properties` file in the same directory to manage your local configurations. It may look like this:

./gradle-local.properties
```
liferay.workspace.home.dir=/my/bundles/directory/liferay-dxp-7.3.10-ga1
```

This should be pointing to the Liferay Home directory.

## Example of Custom Personal Menu Entry Service

This was created by the following process:

#### Create a new Liferay Workspace

```
 $ blade init -v dxp-7.3-ga1 toggle-control-menu-personal-menu-entry-test
```

#### Navigate into the Workspace

```
 $ cd toggle-control-menu-personal-menu-entry-test
```

#### Create the Module

```
 $ blade create \
	-t service \
	-p com.liferay.users.admin.web.internal.product.navigation.personal.menu \
	-s com.liferay.product.navigation.personal.menu.PersonalMenuEntry \
	-c ToggleControlMenuPersonalMenuEntry \
	toggle-control-menu-personal-menu-entry-test
```

To understand what all the flags mean, run the command `blade help create`. It will print out the options and what they do.

After that you can view the git log to see the required changes necessary to add the logic and get it working.