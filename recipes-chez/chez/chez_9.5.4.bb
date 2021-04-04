# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "The Chez Scheme programming language"
HOMEPAGE = "https://cisco.github.io/ChezScheme/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "base"
DEPENDS = "ncurses util-linux chez-native"

BBCLASSEXTEND = "native"

EXTRA_OECONF = "'--threads'"
LDFLAGS += " -ltinfo "

PARALLEL_MAKE = "-j 1"

SRC_URI = "https://github.com/cisco/ChezScheme/releases/download/v${PV}/csv${PV}.tar.gz"
SRC_URI[sha256sum] = "e5baa3702670542c734a32ad5e91ddbc3477a5b2079278ffb86fd58fd6c5079f"

S = "${WORKDIR}/csv${PV}"

do_configure () {
  ./configure --threads --installbin=${D}${bindir} --installlib=${D}${libdir} --installman=${D}${mandir} --disable-x11 # --32
}

do_install_append () {
  oe_runmake install
}
