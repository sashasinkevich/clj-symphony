;
; Copyright © 2016 Symphony Software Foundation
;
; Licensed under the Apache License, Version 2.0 (the "License");
; you may not use this file except in compliance with the License.
; You may obtain a copy of the License at
; 
;     http://www.apache.org/licenses/LICENSE-2.0
; 
; Unless required by applicable law or agreed to in writing, software
; distributed under the License is distributed on an "AS IS" BASIS,
; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
; See the License for the specific language governing permissions and
; limitations under the License.
; 

(defproject foundation.symphony/clj-symphony "0.1.0-SNAPSHOT"
  :description        "A Clojure wrapper around the symphony-java-client library."
  :url                "https://github.com/pmonks/clj-symphony"
  :license            {:name "Apache License, Version 2.0"
                       :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :min-lein-version   "2.5.0"
  :repositories       [["sonatype-snapshots" {:url "https://oss.sonatype.org/content/groups/public" :snapshots true}]]
  :dependencies       [
                        [org.clojure/clojure                      "1.8.0"]
                        [org.symphonyoss.symphony/symphony-client "0.9.0"]
                      ]
  :profiles           {:dev {:dependencies [[midje      "1.8.3"]]
                             :plugins      [[lein-midje "3.2"]]}   ; Don't remove this or travis-ci will assplode!
                       :uberjar {:aot :all}}
  :lein-release       {:deploy-via :clojars}
  )
