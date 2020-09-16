window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbrirModalONE = window.blockly.js.blockly.AbrirModalONE || {};

/**
 * abrirModalONE
 */
window.blockly.js.blockly.AbrirModalONE.Executar = async function() {

  this.cronapi.screen.showModal("modalONE");
  this.cronapi.screen.hideModal("modalTWO");
}
