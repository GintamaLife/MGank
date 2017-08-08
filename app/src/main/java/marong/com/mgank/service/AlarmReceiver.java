/*
 * Copyright (C) 2015 Drakeet <drakeet.me@gmail.com>
 *
 * This file is part of Meizhi
 *
 * Meizhi is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Meizhi is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Meizhi.  If not, see <http://www.gnu.org/licenses/>.
 */

package marong.com.mgank.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import marong.com.mgank.MainActivity;
import marong.com.mgank.R;
import marong.com.mgank.utils.HeadsUps;
import marong.com.mgank.utils.PreferencesLoader;


/**
 * Created by drakeet on 7/1/15.
 */
public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        PreferencesLoader loader = new PreferencesLoader(context);
        if (loader.getBoolean(R.string.action_notifiable, true)) {
            HeadsUps.show(context, MainActivity.class,
                    context.getString(R.string.heads_up_title),
                    context.getString(R.string.heads_up_content),
                    R.mipmap.ic_meizhi_150602, R.mipmap.ic_female, 123123);
        }
    }
}