/*                     __                                               *\
**     ________ ___   / /  ___     Scala Android                        **
**    / __/ __// _ | / /  / _ |    (c) 2009-2011, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */


package scala.android.app;

/*
 * This helper class is a workaround for accessing Java static constants from
 * Scala code when whose constants are defined in Java static inner interfaces.
 *
 * @author Stephane Micheloud
 * @version 1.0
 */
class Activity$ extends android.app.Activity {

    /** @since API level 4 */
    public static final String ACCESSIBILITY_SERVICE =
        android.app.Activity.ACCESSIBILITY_SERVICE;

    /** @since API level 5 */
    public static final String ACCOUNT_SERVICE =
        android.app.Activity.ACCOUNT_SERVICE;

    /** @since API level 1 */
    public static final String ACTIVITY_SERVICE =
        android.app.Activity.ACTIVITY_SERVICE;

    /** @since API level 1 */
    public static final String ALARM_SERVICE =
        android.app.Activity.ALARM_SERVICE;

    /** @since API level 1 */
    public static final String AUDIO_SERVICE =
        android.app.Activity.AUDIO_SERVICE;

    /** @since API level 1 */
    public static final int BIND_AUTO_CREATE =
        android.app.Activity.BIND_AUTO_CREATE;

    /** @since API level 1 */
    public static final int BIND_DEBUG_UNBIND =
        android.app.Activity.BIND_DEBUG_UNBIND;

    /** @since API level 8 */ /*
    public static final int BIND_NOT_FOREGROUND =
        android.app.Activity.BIND_NOT_FOREGROUND;
*/
    /** @since API level 1 */
    public static final String CLIPBOARD_SERVICE =
        android.app.Activity.CLIPBOARD_SERVICE;

    /** @since API level 1 */
    public static final String CONNECTIVITY_SERVICE =
        android.app.Activity.CONNECTIVITY_SERVICE;

    /** @since API level 1 */
    public static final int CONTEXT_IGNORE_SECURITY =
        android.app.Activity.CONTEXT_IGNORE_SECURITY;

    /** @since API level 1 */
    public static final int CONTEXT_INCLUDE_CODE =
        android.app.Activity.CONTEXT_INCLUDE_CODE;

    /** @since API level 4 */
    public static final int CONTEXT_RESTRICTED =
        android.app.Activity.CONTEXT_RESTRICTED;

    /** @since API level 1 */
    public static final int DEFAULT_KEYS_DIALER =
        android.app.Activity.DEFAULT_KEYS_DIALER;

    /** @since API level 1 */
    public static final int  DEFAULT_KEYS_DISABLE =
        android.app.Activity.DEFAULT_KEYS_DISABLE;

    /** @since API level 1 */
    public static final int DEFAULT_KEYS_SEARCH_GLOBAL =
        android.app.Activity.DEFAULT_KEYS_SEARCH_GLOBAL;

    /** @since API level 1 */
    public static final int DEFAULT_KEYS_SEARCH_LOCAL =
        android.app.Activity.DEFAULT_KEYS_SEARCH_LOCAL;

    /** @since API level 1 */
    public static final int DEFAULT_KEYS_SHORTCUT =
        android.app.Activity.DEFAULT_KEYS_SHORTCUT;

    /** @since API level 8 */ /*
    public static final String DEVICE_POLICY_SERVICE =
        android.app.Activity.DEVICE_POLICY_SERVICE;
*/
    /** @since API level 8 */ /*
    public static final String DROPBOX_SERVICE =
        android.app.Activity.DROPBOX_SERVICE;
*/
    /** @since API level 1 */
    //protected static final int[] FOCUSED_STATE_SET =
    public static final int[] FOCUSED_STATE_SET =
        android.app.Activity.FOCUSED_STATE_SET;

    /** @since API level 3 */
    public static final String INPUT_METHOD_SERVICE =
        android.app.Activity.INPUT_METHOD_SERVICE;

    /** @since API level 1 */
    public static final String KEYGUARD_SERVICE =
        android.app.Activity.KEYGUARD_SERVICE;

    /** @since API level 1 */
    public static final String LAYOUT_INFLATER_SERVICE =
        android.app.Activity.LAYOUT_INFLATER_SERVICE;

    /** @since API level 1 */
    public static final String LOCATION_SERVICE =
        android.app.Activity.LOCATION_SERVICE;

    /** @since API level 1 */
    public static final int MODE_APPEND =
        android.app.Activity.MODE_APPEND;

    /** @since API level 1 */
    public static final int MODE_PRIVATE =
        android.app.Activity.MODE_PRIVATE;

    /** @since API level 1 */
    public static final int MODE_WORLD_READABLE =
        android.app.Activity.MODE_WORLD_READABLE;

    /** @since API level 1 */
    public static final int MODE_WORLD_WRITEABLE =
        android.app.Activity.MODE_WORLD_WRITEABLE;

    /** @since API level 1 */
    public static final String NOTIFICATION_SERVICE =
        android.app.Activity.NOTIFICATION_SERVICE;

    /** @since API level 1 */
    public static final String POWER_SERVICE =
        android.app.Activity.POWER_SERVICE;

    /** @since API level 1 */
    public static final int  RESULT_CANCELED =
        android.app.Activity.RESULT_CANCELED;

    /** @since API level 1 */
    public static final int  RESULT_FIRST_USER =
        android.app.Activity.RESULT_FIRST_USER;

    /** @since API level 1 */
    public static final int  RESULT_OK =
        android.app.Activity.RESULT_OK;

    /** @since API level 1 */
    public static final String SEARCH_SERVICE =
        android.app.Activity.SEARCH_SERVICE;

    /** @since API level 1 */
    public static final String SENSOR_SERVICE =
        android.app.Activity.SENSOR_SERVICE;

    /** @since API level 1 */
    public static final String TELEPHONY_SERVICE =
        android.app.Activity.TELEPHONY_SERVICE;

    /** @since API level 8 */ /*
    public static final String UI_MODE_SERVICE =
        android.app.Activity.UI_MODE_SERVICE;
*/
    /** @since API level 1 */
    public static final String VIBRATOR_SERVICE =
        android.app.Activity.VIBRATOR_SERVICE;

    /** @since API level 1 */
    public static final String WALLPAPER_SERVICE =
        android.app.Activity.WALLPAPER_SERVICE;

    /** @since API level 1 */
    public static final String WIFI_SERVICE =
        android.app.Activity.WIFI_SERVICE;

    /** @since API level 1 */
    public static final String WINDOW_SERVICE =
        android.app.Activity.WINDOW_SERVICE;

}
