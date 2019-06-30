const DemandaDao = require('../infra/demanda-dao');
const db = require('../../config/database');

module.exports = (app) => {
    app.get('/', function(request, response) {
        response.marko(require('../views/index.marko'))
    });
    
    app.get('/demandas', function (request, response) {
        const demandaDao = new DemandaDao(db);
        demandaDao.lista()
            .then(demandas => response.marko(
                require('../views/demandas/lista.marko'),
                {
                    demandas: demandas
                }
            ))
            .catch(erro => console.log(erro));
    });

    app.get('/servicos/advocacia', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/servicos/arquitetura', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/servicos/artes', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/servicos/engenharia', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/servicos/esportes', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/servicos/saude', function(request, response) {
        response.marko(require('../views/servicos/saude.marko'));
    });

    app.get('/sobre', function(request, response) {
        response.marko(require('../views/sobre.marko'));
    });

};
