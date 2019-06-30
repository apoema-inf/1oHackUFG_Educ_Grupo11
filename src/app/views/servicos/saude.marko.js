// Compiled using marko@4.13.4-1 - DO NOT EDIT
"use strict";

var marko_template = module.exports = require("marko/src/html").t(__filename),
    marko_componentType = "/colmeia$1.0.0/src/app/views/servicos/saude.marko",
    components_helpers = require("marko/src/components/helpers"),
    marko_renderer = components_helpers.r,
    marko_defineComponent = components_helpers.c,
    hasRenderBodyKey = Symbol.for("hasRenderBody"),
    marko_loadTemplate = require("marko/src/runtime/helper-loadTemplate"),
    layout_template = marko_loadTemplate(require.resolve("../components/layout.marko")),
    marko_helpers = require("marko/src/runtime/html/helpers"),
    marko_loadTag = marko_helpers.t,
    layout_tag = marko_loadTag(layout_template);

function render(input, out, __component, component, state) {
  var data = input;

  layout_tag({
      heading: {
          renderBody: function renderBody(out) {
            out.w("<h1 class=\"servico\">Saúde</h1>");
          }
        },
      content: {
          renderBody: function renderBody(out) {
            out.w("<div class=\"row\"><div class=\"col-lg\"><h2 class=\"servico\">Medicina</h2><h3>Realizado pela Faculdade de Medicina (FM)</h3><h4>Servicos oferecidos:</h4><li><ul>Cirurgia</ul><ul>Pronto socorro</ul><ul>Oftalmologia</ul><ul>Acompanhamento medico</ul></li><section class=\"servico endereco\">Localizado em: Universidade Federal de Goiás, Câmpus Colemar Natal e Silva (Câmpus I) Endereço: R. 235, s/n - Setor Leste Universitário, Goiânia - GO, 74605-050</section></div></div>");
          }
        },
      [hasRenderBodyKey]: true
    }, out, __component, "0");
}

marko_template._ = marko_renderer(render, {
    ___implicit: true,
    ___type: marko_componentType
  });

marko_template.Component = marko_defineComponent({}, marko_template._);

marko_template.meta = {
    id: "/colmeia$1.0.0/src/app/views/servicos/saude.marko",
    tags: [
      "../components/layout.marko"
    ]
  };
