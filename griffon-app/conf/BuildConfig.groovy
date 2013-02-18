griffon.project.dependency.resolution = {
    // inherit Griffon' default dependencies
    inherits "global"
    log "warn"
    repositories {
        griffonHome()
        mavenCentral()
    }
    dependencies {
        compile('commons-httpclient:commons-httpclient:3.1') {
            excludes 'commons-logging', 'commons-codec'
        }
        compile('xerces:xercesImpl:2.9.1') {
            excludes 'xml-apis'
        }
        compile('rome:rome:1.0') {
            excludes 'jdom'
        }
        compile 'org.jdom:jdom:1.1',
                'org.json:json:20090211',
                'net.sf.jtidy:jtidy:r938',
                'commons-codec:commons-codec:1.4',
                'org.swinglabs.swingx:swingx-core:1.6.5',
                'org.swinglabs.swingx:swingx-beaninfo:1.6.5'
    }
}

log4j = {
    // Example of changing the log pattern for the default console
    // appender:
    appenders {
        console name: 'stdout', layout: pattern(conversionPattern: '%d [%t] %-5p %c - %m%n')
    }

    error 'org.codehaus.griffon',
          'org.springframework',
          'org.apache.karaf',
          'groovyx.net'
    warn  'griffon'
}
