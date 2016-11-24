java_binary(
    name = "fred",
    srcs = glob(["src/**/*.java"]),
    main_class = "freenet.node.Node",
    javacopts = ["-extra_checks:off"],
    resources = glob(["src/freenet/l10n/*properties"])
        + glob(["src/freenet/l10n/iso-*.tab"])
        + glob(["src/freenet/clients/http/staticfiles/**"])
        + glob(["dependencies.properties"]),
    deps = [
        "@org_bouncycastle_bcprov_jdk15on//jar",
        "@org_apache_commons_commons_compress//jar",
        "@net_java_dev_jna_jna//jar",
        "@bit_collider//:bit_collider",
        "//contrib:freenet_ext",
        "//contrib:wrapper",
        "//contrib:ext",
        "//contrib:fec",
        "//contrib:fec_common",
    ],
)
