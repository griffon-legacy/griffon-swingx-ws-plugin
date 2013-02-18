/*
 * Copyright 2009-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class SwingxWsGriffonPlugin {
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.2.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = ['swing': '1.2.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-swingx-ws-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]

    String title = 'Map visualizations with Swingx-ws'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Adds a Map widget using [swingx-ws][1]'s JXMapKit and/or JXMapView.
Includes modified source compliant with Swingx 1.6.5.

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| Node            | Property         | Type                      | Default                                  | Required | Bindable | Notes                                                                         |
| --------------- | ---------------- | ------------------------- | ---------------------------------------- | -------- | -------- | ----------------------------------------------------------------------------- |
| jxMapKit        | defaultProvider  | JXMapKit.DefaultProviders | JXMapKit.DefaultProviders.OpenStreetMaps | no       | no       |                                                                               |
|                 | zoom             | int                       | 15                                       | no       | no       |                                                                               |
|                 |                  |                           |                                          |          |          | all other JXMapKit properties apply as well                                   |
| jxMapView       |                  |                           |                                          |          |          | all JXMapViewer properties apply                                              |
| geoBounds       | minLat           | double                    | 0                                        | no       | no       |                                                                               |
|                 | minLng           | double                    | 0                                        | no       | no       |                                                                               |
|                 | maxLat           | double                    | 0                                        | no       | no       |                                                                               |
|                 | maxLng           | double                    | 0                                        | no       | no       |                                                                               |
| geoPosition     | coords           | double (array)            |                                          | no       | no       | must be of size 2                                                             |
|                 | latitude         | double                    | 0                                        | no       | no       | usually paired with longitude                                                 |
|                 | longitude        | double                    | 0                                        | no       | no       | usually paired with latitude                                                  |
|                 | latDegrees       | double                    | 0                                        | no       | no       |                                                                               |
|                 | latMinutes       | double                    | 0                                        | no       | no       |                                                                               |
|                 | latSeconds       | double                    | 0                                        | no       | no       |                                                                               |
|                 | lonDegrees       | double                    | 0                                        | no       | no       |                                                                               |
|                 | lonMinutes       | double                    | 0                                        | no       | no       |                                                                               |
|                 | lonSeconds       | double                    | 0                                        | no       | no       |                                                                               |
|                 |                  |                           |                                          |          |          | choose between coords, (latitude, longitude) or the 6 specific lat/lon values |
| waypoint        | latitude         | double                    | 0                                        | no       | no       |                                                                               |
|                 | longitude        | double                    | 0                                        | no       | no       |                                                                               |
| tileFactory     | tileFactoryInfo  | TileFactoryInfo           |                                          | no       | no       |                                                                               |
|                 |                  |                           |                                          |          |          | you can also define the properties of `tileFactoryInfo()`                     |
| tileFactoryInfo | minimumZoomLevel | int                       | 1                                        | no       | no       |                                                                               |
|                 | maximumZoomLevel | int                       | 15                                       | no       | no       |                                                                               |
|                 | totalMapZoom     | int                       | 17                                       | no       | no       |                                                                               |
|                 | tileSize         | int                       | 256                                      | no       | no       |                                                                               |
|                 | xr2l             | boolean                   | true                                     | no       | no       |                                                                               |
|                 | yt2b             | boolean                   | true                                     | no       | no       |                                                                               |
|                 | baseURL          | String                    |                                          | yes      | no       |                                                                               |
|                 | xparam           | String                    | 'x'                                      | no       | no       |                                                                               |
|                 | yparam           | String                    | 'y'                                      | no       | no       |                                                                               |
|                 | zparam           | String                    | 'z'                                      | no       | no       |                                                                               |

Here is a simple example of a JXMapKit in action

    application(title: 'MapView',
      size:[320,320],
      locationByPlatform:true,
      iconImage: imageIcon('/griffon-icon-48x48.png').image,
      iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                   imageIcon('/griffon-icon-32x32.png').image,
                   imageIcon('/griffon-icon-16x16.png').image]) {
        jxmapKit(addressLocationShown: true, dataProviderCreditShown: false,
            miniMapVisible: false, zoomButtonsVisible: true, zoom: 5) {
            waypoint(latitude: 10, longitude: 10) // random
            waypoint(latitude: 41, longitude: -87) // Chicago ?
        }
    }

[1]: http://java.net/projects/swingx-ws/
'''
}
