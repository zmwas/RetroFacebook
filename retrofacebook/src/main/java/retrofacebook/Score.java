/*
 * Copyright (C) 2015 8tory, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofacebook;

import auto.json.AutoJson;
import android.support.annotation.Nullable;
import android.os.Bundle;

/**
 * @see https://developers.facebook.com/docs/graph-api/reference/v2.3/user/scores
 */
@AutoJson
public abstract class Score {
    @Nullable
    @AutoJson.Field
    public abstract User user();
    @Nullable
    @AutoJson.Field
    public abstract int score();
    @Nullable
    @AutoJson.Field
    public abstract App application();

    @AutoJson.Builder
    public abstract static class Builder {
        public abstract Builder user(User x);
        public abstract Builder score(int x);
        public abstract Builder application(App x);

        public abstract Score build();
    }

    public static Builder builder() {
        return new AutoJson_Score.Builder();
    }

    public abstract Bundle toBundle();
}
