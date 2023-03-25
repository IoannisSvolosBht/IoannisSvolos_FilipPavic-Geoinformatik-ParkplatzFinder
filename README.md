# GraphHopper Routing Engine

![Build Status](https://github.com/graphhopper/graphhopper/actions/workflows/build.yml/badge.svg?branch=master)

GraphHopper is a fast and memory-efficient routing engine released under Apache License 2.0. It can be used as a Java library or standalone web server to calculate the distance, time, turn-by-turn instructions and many road attributes for a route between two or more points. Beyond this "A-to-B" routing it supports ["snap to road"](README.md#Map-Matching), [Isochrone calculation](README.md#Analysis), [mobile navigation](README.md#mobile-apps) and [more](README.md#Features). GraphHopper uses OpenStreetMap and GTFS data by default and it can import [other data sources too](README.md#OpenStreetMap-Support).

# Community

We have an open community and welcome everyone. Let us know your problems, use cases or just [say hello](https://discuss.graphhopper.com/). Please see our [community guidelines](https://graphhopper.com/agreements/cccoc.html).

## Questions

All questions go to our [forum](https://discuss.graphhopper.com/) where we also have subsections specially for developers, mobile usage, and [our map matching component](./map-matching). You can also search [Stackoverflow](http://stackoverflow.com/questions/tagged/graphhopper) for answers. Please do not use our issue section for questions :)

## Contribute

Read through [how to contribute](CONTRIBUTING.md) for information on topics
like finding and fixing bugs and improving our documentation or translations! 
We even have [good first issues](https://github.com/graphhopper/graphhopper/issues?q=is%3Aopen+is%3Aissue+label%3A%22good+first+issue%22) to get started.

## Get Started

To get started you can try [GraphHopper Maps](README.md#graphhopper-maps), read through our documentation and install the GraphHopper Web Service locally.

* 7.x: [documentation](https://github.com/graphhopper/graphhopper/blob/7.x/docs/index.md)
  , [web service jar](https://repo1.maven.org/maven2/com/graphhopper/graphhopper-web/7.0/graphhopper-web-7.0.jar)
  , [announcement](https://www.graphhopper.com/blog/2023/03/14/graphhopper-routing-engine-7-0-released/)
* unstable master: [documentation](https://github.com/graphhopper/graphhopper/blob/master/docs/index.md)

<details><summary>Click to see older releases</summary>

* See our [changelog file](./CHANGELOG.md) for Java API Changes.
* 6.x: [documentation](https://github.com/graphhopper/graphhopper/blob/6.x/docs/index.md)
  , [web service jar](https://repo1.maven.org/maven2/com/graphhopper/graphhopper-web/6.2/graphhopper-web-6.2.jar)
  , [announcement](https://www.graphhopper.com/blog/2022/09/19/graphhopper-routing-engine-6-0-released/)
* 5.x: [documentation](https://github.com/graphhopper/graphhopper/blob/5.x/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/5.3/graphhopper-web-5.3.jar)
  , [announcement](https://www.graphhopper.com/blog/2022/03/23/graphhopper-routing-engine-5-0-released/)
* 4.x: [documentation](https://github.com/graphhopper/graphhopper/blob/4.x/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/4.0/graphhopper-web-4.0.jar)
  , [announcement](https://www.graphhopper.com/blog/2021/09/29/graphhopper-routing-engine-4-0-released/)
* 3.x: [documentation](https://github.com/graphhopper/graphhopper/blob/3.x/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/3.2/graphhopper-web-3.2.jar)
  , [announcement](https://www.graphhopper.com/blog/2021/05/18/graphhopper-routing-engine-3-0-released/)
* 2.x: [documentation](https://github.com/graphhopper/graphhopper/blob/2.x/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/2.4/graphhopper-web-2.4.jar)
  , [announcement](https://www.graphhopper.com/blog/2020/09/30/graphhopper-routing-engine-2-0-released/)
* 1.0: [documentation](https://github.com/graphhopper/graphhopper/blob/1.0/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/1.0/graphhopper-web-1.0.jar)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/1.0/graphhopper-android-1.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2020/05/25/graphhopper-routing-engine-1-0-released/)
* 0.13.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.13/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/0.13.0/graphhopper-web-0.13.0.jar)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.13.0/graphhopper-android-0.13.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2019/09/18/graphhopper-routing-engine-0-13-released/)
* 0.12.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.12/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/0.12.0/graphhopper-web-0.12.0.jar)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.12.0/graphhopper-android-0.12.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2019/03/26/graphhopper-routing-engine-0-12-released/)
* 0.11.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.11/docs/index.md)
  , [web service jar](https://github.com/graphhopper/graphhopper/releases/download/0.11.0/graphhopper-web-0.11.0.jar)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.11.0/graphhopper-android-0.11.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2018/09/17/graphhopper-routing-engine-0-11-release-open-sourcing-the-isochrone-module/)
* 0.10.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.10/docs/index.md)
  , [web service zip](https://github.com/graphhopper/graphhopper/releases/download/0.10.3/graphhopper-web-0.10.3-bin.zip)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.10.3/graphhopper-android-0.10.3.apk)
  , [announcement](https://www.graphhopper.com/blog/2018/03/08/graphhopper-routing-engine-0-10-released/)
* 0.9.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.9/docs/index.md)
  , [web service zip](https://github.com/graphhopper/graphhopper/releases/download/0.9.0/graphhopper-web-0.9.0-bin.zip)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.9.0/graphhopper-android-0.9.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2017/05/31/graphhopper-routing-engine-0-9-released/)
* 0.8.2: [documentation](https://github.com/graphhopper/graphhopper/blob/0.8/docs/index.md)
  , [web service zip](https://github.com/graphhopper/graphhopper/releases/download/0.8.2/graphhopper-web-0.8.2-bin.zip)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.8.2/graphhopper-android-0.8.2.apk)
  , [announcement](https://www.graphhopper.com/blog/2016/10/18/graphhopper-routing-engine-0-8-released/)
* 0.7.0: [documentation](https://github.com/graphhopper/graphhopper/blob/0.7/docs/index.md)
  , [web service zip](https://github.com/graphhopper/graphhopper/releases/download/0.7.0/graphhopper-web-0.7.0-bin.zip)
  , [Android APK](https://github.com/graphhopper/graphhopper/releases/download/0.7.0/graphhopper-android-0.7.0.apk)
  , [announcement](https://www.graphhopper.com/blog/2016/06/15/graphhopper-routing-engine-0-7-released/)
</details>

## Installation

To install the [GraphHopper Maps](https://graphhopper.com/maps/) UI and the web service locally you [need a JVM](https://adoptium.net) (>= Java 8) and do:

```bash
wget https://repo1.maven.org/maven2/com/graphhopper/graphhopper-web/7.0/graphhopper-web-7.0.jar https://raw.githubusercontent.com/graphhopper/graphhopper/7.x/config-example.yml http://download.geofabrik.de/europe/germany/berlin-latest.osm.pbf
java -D"dw.graphhopper.datareader.file=berlin-latest.osm.pbf" -jar graphhopper*.jar server config-example.yml
```

After a while you see a log message with 'Server - Started', then go to http://localhost:8989/ and
you'll see a map of Berlin. You should be able to right click on the map to create a route.

See the [documentation](./docs/index.md) that contains e.g. [the elevation guide](./docs/core/elevation.md) and the [deployment guide](./docs/core/deploy.md).

### Docker

The Docker images created by the community from the `master` branch can be found [here](https://hub.docker.com/r/israelhikingmap/graphhopper)
(currently daily). See the [Dockerfile](https://github.com/IsraelHikingMap/graphhopper-docker-image-push) for more details.

## GraphHopper Maps

To see the road routing feature of GraphHopper in action please go to [GraphHopper Maps](https://graphhopper.com/maps).

[![GraphHopper Maps](https://www.graphhopper.com/wp-content/uploads/2022/10/maps2-1024x661.png)](https://graphhopper.com/maps)

GraphHopper Maps is an open source user interface, which you can find [here](https://github.com/graphhopper/graphhopper-maps). It can use this open source routing engine or the [GraphHopper Directions API](https://www.graphhopper.com), which provides the Routing API, a Route Optimization API (based on [jsprit](http://jsprit.github.io/)), a fast Matrix API and an address search (based on [photon](https://github.com/komoot/photon)). The photon project is also supported by the GraphHopper GmbH. Additionally to the GraphHopper Directions API, map tiles from various providers are used where the default is [Omniscale](http://omniscale.com/). 

All this is available for free, via encrypted connections and from German servers for a nice and private route planning experience!
