// Compiled using marko@4.13.4-1 - DO NOT EDIT
"use strict";

var marko_template = module.exports = require("marko/src/html").t(__filename),
    marko_componentType = "/colmeia$1.0.0/src/app/views/sobre.marko",
    components_helpers = require("marko/src/components/helpers"),
    marko_renderer = components_helpers.r,
    marko_defineComponent = components_helpers.c,
    hasRenderBodyKey = Symbol.for("hasRenderBody"),
    marko_loadTemplate = require("marko/src/runtime/helper-loadTemplate"),
    layout_template = marko_loadTemplate(require.resolve("./components/layout.marko")),
    marko_helpers = require("marko/src/runtime/html/helpers"),
    marko_loadTag = marko_helpers.t,
    layout_tag = marko_loadTag(layout_template);

function render(input, out, __component, component, state) {
  var data = input;

  layout_tag({
      heading: {
          renderBody: function renderBody(out) {
            out.w("<h1 id=\"titulo-sobre\">Sobre</h1>");
          }
        },
      content: {
          renderBody: function renderBody(out) {
            out.w("<div class=\"row\"><div class=\"col-lg\"><p>Uma solução proposta para conectar a UFG diretamente a comunidade externa, de forma a mostrar toado o trabalho que é feito na universidade e muitas vezes não é visto. O site oferece os servicos que já eram antes oferecidos pela UFG como instituicao, mas que nao possuiam visibilidade, além de criar uma nova oportunidade para alunos e uma maior visibilidade para Empresas Juniores. A comunidade da UFG pode disponibilizar seus serviços, que serão aceitos pela plataforma e disponibilizados para todo o Brasil, de acordo com suas areas de atuação.</p></div><div class=\"col-lg\"><figure><img src=\"/images/c_preto.svg\" alt=\"Colméia\" id=\"colmeia-sobre\"></figure></div></div>");
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
    id: "/colmeia$1.0.0/src/app/views/sobre.marko",
    tags: [
      "./components/layout.marko"
    ]
  };
