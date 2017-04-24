package com.lxr.perfectguangde.app;

import java.io.File;

/**
 * Created by Admin on 2017/4/24  15:43
 *
 * @desc
 */

public class Constants {

    //================= PATH ====================

    public static final String PATH_DATA = App.getInstance().getCacheDir().getAbsolutePath() + File.separator + "data";

    public static final String PATH_CACHE = PATH_DATA + "/NetCache";

}
