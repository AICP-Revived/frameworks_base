/*
 * Copyright (C) 2015 The CyanogenMod Project
 * Copyright (C) 2018 AICP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.internal.util.aicp;

import android.content.Context;
import com.android.internal.widget.LockPatternUtils;
import android.provider.Settings;

public class AicpLockPatternUtils extends LockPatternUtils {
    public AicpLockPatternUtils(Context context) {
        super(context);
    }

    public boolean shouldPassToSecurityView(int userId) {
        return getBoolean(Settings.Secure.LOCK_PASS_TO_SECURITY_VIEW, false, userId);
    }

    public void setPassToSecurityView(boolean enabled, int userId) {
        setBoolean(Settings.Secure.LOCK_PASS_TO_SECURITY_VIEW, enabled, userId);
    }
}
