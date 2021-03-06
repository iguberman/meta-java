require jakarta-commons.inc

PR = "${INC_PR}.1"

DESCRIPTION = "Java Internet protocol suite library"

SRC_URI = "http://archive.apache.org/dist/commons/logging/source/${BP}-src.tar.gz"

DEPENDS += "log4j1.2 servlet2.3 logkit"
DEPENDS_virtclass-native += "log4j1.2-native servlet2.3-native logkit-native"

CP = "log4j-1.2 servlet-2.3 logkit"

COMPILE_FINDARGS = "-name '*.java' -and -not -name '*Avalon*'"

SRC_URI[md5sum] = "e5cfa8cca13152d7545fde6b1783c60a"
SRC_URI[sha256sum] = "b49a79fa78ebfae15dc46ae6f0144fee6b94ab608a25518c54609d3419909eb2"

BBCLASSEXTEND = "native"

ALLOW_EMPTY_${PN} = "1"
