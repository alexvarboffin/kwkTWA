@echo off

echo Generating Release APK...
call gradlew :app_scoreap_2:assembleRelease

echo.
echo Generating Release AAB...
call gradlew :app_scoreap_2:bundleRelease

echo.
echo Build finished.
echo APK is in app_scoreap_2/build/outputs/apk/release/
echo AAB is in app_scoreap_2\build\outputs\bundle\release

move app_scoreap_2\build\outputs\bundle\release\* .
move app_scoreap_2\build\outputs\apk\release\* .

pause