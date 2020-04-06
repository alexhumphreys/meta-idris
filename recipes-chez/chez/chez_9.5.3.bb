# Copyright (C) 2020 Alex Humphreys <alex.humphreys@here.com>
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "The Chez Scheme programming language"
HOMEPAGE = "https://cisco.github.io/ChezScheme/"
LICENSE = "APACHE-2.0"
LIC_FILES_CHKSUM = "file://${S}/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"
SECTION = "base"
DEPENDS = "libuuid-native"

BBCLASSEXTEND = "native"

PARALLEL_MAKE = "-j 1"

SRC_URI = "git://github.com/cisco/ChezScheme;tag=v9.5.2;protocol=git"

S = "${WORKDIR}/git"
