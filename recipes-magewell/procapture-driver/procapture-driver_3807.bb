SUMMARY = "Magewell ProCapture Driver"

LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://../docs/Readme.txt;beginline=41;endline=57;md5=76340ec14af04826e8d4dcfaefd05b67"

SRC_URI = "http://www.magewell.com/files/ProCaptureForLinux_${PV}.tar.gz \
           file://0001-64bit-Makefile.patch \
           file://0002-64bit-Makefile-clean.patch \
"

SRC_URI[md5sum] = "f6a03817cf6df791b12a24f0a15c550b"
SRC_URI[sha256sum] = "112dfe3782435cd1f0b2f8381d80186c0372a3d28877f7d3433a8b8233b73cab"

inherit module

S = "${WORKDIR}/ProCaptureForLinux_${PV}/src"