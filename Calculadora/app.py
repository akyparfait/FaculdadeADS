from flask import Flask, request, jsonify
from flask_cors import CORS
import numexpr as ne

app = Flask(__name__)
CORS(app)

@app.route('/calcular', methods=['POST'])
def calcular():
    dados = request.get_json()
    expressao = dados.get('expressao', '')
    try:
        resultado = ne.evaluate(expressao).item()
        return jsonify({'resultado': resultado})
    except Exception as e:
        return jsonify({'erro': 'Expressão inválida'})

if __name__ == '__main__':
    app.run(debug=True)