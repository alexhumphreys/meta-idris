# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A test recipe for Idris"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS = "nodejs idris-native"
REPENDS = "nodejs"

SRC_URI = "file://Hello.idr"

S = "${WORKDIR}"

do_compile() {
    ls
    idris2 Hello.idr --codegen node -o hello
}

do_install_append () {
    install -d ${D}${libdir}/hello-idris
    ls
    install ${S}/build/exec/hello ${D}/${libdir}/hello-idris/hello
}
