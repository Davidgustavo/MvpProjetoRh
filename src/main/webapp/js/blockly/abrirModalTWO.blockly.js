window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbrirModalTWO = window.blockly.js.blockly.AbrirModalTWO || {};

/**
 * abrirModalTWO
 */
window.blockly.js.blockly.AbrirModalTWO.Executar = async function() {

  this.cronapi.screen.showModal("modalTWO");
  this.cronapi.screen.hideModal("modalONE");
}
