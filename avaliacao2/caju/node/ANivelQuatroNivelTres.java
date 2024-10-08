/* This file was generated by SableCC (http://www.sablecc.org/). */

package caju.node;

import caju.analysis.*;

@SuppressWarnings("nls")
public final class ANivelQuatroNivelTres extends PNivelTres
{
    private PNivelQuatro _nivelQuatro_;

    public ANivelQuatroNivelTres()
    {
        // Constructor
    }

    public ANivelQuatroNivelTres(
        @SuppressWarnings("hiding") PNivelQuatro _nivelQuatro_)
    {
        // Constructor
        setNivelQuatro(_nivelQuatro_);

    }

    @Override
    public Object clone()
    {
        return new ANivelQuatroNivelTres(
            cloneNode(this._nivelQuatro_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANivelQuatroNivelTres(this);
    }

    public PNivelQuatro getNivelQuatro()
    {
        return this._nivelQuatro_;
    }

    public void setNivelQuatro(PNivelQuatro node)
    {
        if(this._nivelQuatro_ != null)
        {
            this._nivelQuatro_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._nivelQuatro_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._nivelQuatro_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._nivelQuatro_ == child)
        {
            this._nivelQuatro_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._nivelQuatro_ == oldChild)
        {
            setNivelQuatro((PNivelQuatro) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
