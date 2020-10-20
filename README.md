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