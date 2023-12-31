/*
 * Copyright (C) 2023 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.xuidemo.fragment.expands.materialdesign.motion;

import com.xuexiang.xpage.annotation.Page;
import com.xuexiang.xuidemo.R;
import com.xuexiang.xuidemo.base.BaseFragment;

/**
 * clickAction：定义点击事件的行为，可以有以下几种取值：
 * <p>
 * toggle：切换视图的状态。
 * transitionToEnd：将视图从当前位置过渡到结束位置。
 * transitionToStart：将视图从当前位置过渡到开始位置。
 * jumpToEnd：立即将视图移动到结束位置。
 * jumpToStart：立即将视图移动到开始位置。
 */
@Page(name = "实现简单的登录动画效果")
public class MotionLayoutLoginFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_motion_login;
    }

    @Override
    protected void initViews() {

    }
}
